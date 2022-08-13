package vector_pr;
import java.util.Scanner;
import java.util.Vector;

public class IO {
	
	static Scanner s = new Scanner(System.in);
	
	public IO() {
	}
	static void run(Vector<Integer> rain) {
		
		int precip = -1;
		int sum = 0;
		double avg = 0;
		while(precip != 0) {
			
			System.out.print("강수량 입력(0 입력시 종료)>>");
			precip = s.nextInt();
			if(precip<0){ 
				System.out.println("양수를 입력하시오.");
			}
			else{
				rain.add(precip);
				for(int i=0; i<rain.size();i++) {
					System.out.print(rain.get(i)+" ");
					sum += rain.get(i);
				}
				avg = (double)sum / rain.size();
				sum = 0;
			}
			System.out.println("\n현재 평균 "+avg);
		}
	}
}