package rxp;

import java.util.Scanner;

public class Human extends Player {
	Scanner s = new Scanner(System.in);
	protected Human(String name) {
		super(name);
	}
		
	private String hbet;
	private void sethbet(String bet) {
		this.hbet = bet;
	}
	private String gethbet() {
		return this.hbet;
	}
	@Override
	public String next() {
		System.out.print(this.name+">>");
		sethbet(s.next());
		
		if(this.gethbet().equals("묵")) {
			this.lastBet = this.bet[0];
			System.out.print(this.lastBet);
			return this.lastBet;
		}
		else if(this.gethbet().equals("찌")) {
			this.lastBet = this.bet[1];
			System.out.print(this.lastBet);
			return this.lastBet;
		}
		else if(this.gethbet().equals("빠")) {
			this.lastBet = this.bet[2];
			System.out.print(this.lastBet);
			return this.lastBet;
		}
		else {
			return "다시 입력하시오";
		}
	}
}
