package rxp;

import java.util.Scanner;

public class Game {
	public Game() {
	}
	public void run() {
		Scanner s = new Scanner(System.in);
		
		Player[] players = new Player[3];		
		
		System.out.println("묵찌빠 게임을 시작합니다.");
		System.out.print("선수이름 입력>>");
		players[0] = new Human(s.next());
		System.out.print("컴퓨터이름 입력>>");
		players[1] = new Computer(s.next());

		System.out.println("2명의 선수를 생성 완료하였습니다.");
			
		Player owner;
		Player guest;
		
		String hum, com;
		
		hum = players[0].next();
		com = players[1].next();
		
		owner = players[0];
		guest = players[1];
		
		while(true) {
			
			if(owner.equals(guest)){
				System.out.println(owner.getName()+"이 이겼습니다.");
				break;
			}
			else if(owner.equals("묵") || guest.equals("찌")) {
				owner = players[0];
				guest = players[1];
			}
			else if(owner.equals("묵") || guest.equals("빠")) {
				owner = players[1];
				guest = players[0];
			}
			else if(owner.equals("찌") || guest.equals("묵")) {
				owner = players[1];
				guest = players[0];	
			}
			else if(owner.equals("찌") || guest.equals("빠")) {
				owner = players[0];
				guest = players[1];	
			}
			else if(owner.equals("빠") || guest.equals("찌")) {
				owner = players[1];
				guest = players[0];	
			}
			else if(owner.equals("빠") || guest.equals("묵")) {
				owner = players[0];
				guest = players[1];	
			} 
			owner.next();
			guest.next();

		}

	}	
}
