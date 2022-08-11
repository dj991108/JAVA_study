package HashMap_pr;
import java.util.HashMap;
import java.util.Scanner;

public class Input {
	
	static Scanner s = new Scanner(System.in);
	
	public Input() {
	}  
	static void set_H (HashMap<String, Integer> country) {
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {			
			System.out.print("나라 이름, 인구 >>");
			String nation = s.next();
			if(nation.equals("그만")) {
				break;
			}
			int population = s.nextInt();
			country.put(nation, population);
		}
	}
}
