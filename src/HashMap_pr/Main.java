package HashMap_pr;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Integer>country = new HashMap<>();
		
		Input.set_H(country);
		Search.serch(country);
	}

}
