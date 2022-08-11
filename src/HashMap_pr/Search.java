package HashMap_pr;
import java.util.HashMap;
import java.util.Scanner;

public class Search {
	
	static Scanner s = new Scanner(System.in);
	
	public Search() {
	}
	
	static void serch(HashMap<String, Integer> country) {
		
		while(true) {
			System.out.print("인구 검색>> ");
			String nation = s.next();
			if(nation.equals("그만")) {
				break;
			}
			Integer n = country.get(nation);
			if(n == null) {
				System.out.println(nation+" (은)는 없습니다.");
			}
			else {
				System.out.println(nation+" 의 인구는 "+n);
			}
		}
	}
}
