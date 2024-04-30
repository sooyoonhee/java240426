package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		int income = 0, fare;
		Scanner scanner = new Scanner(System.in);
		//선언은 밖에서 해도 됨.
		
		for (int i =0 ; i<10 ; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scanner.nextInt();
			income +=fare;
		}//요금값은 10번 다 입력받는 식으로 코드를 작성할 것.
		System.out.println("총 수입 : "+ income);
		scanner.close();
	}
}
