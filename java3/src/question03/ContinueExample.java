package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("정수를 5개 입력하세요.");
		int sum=0;
		
//		for (int i = 1; i <= 5; i++) {
//			int a = scanner.nextInt();
//			if (a>0) {
//			sum +=a;	
//			}
//		}
		for (int i = 1; i <= 5; i++) {
			int a = scanner.nextInt();
			if (a<=0) {
				continue;
			}else {
			sum +=a;	
		}
		}System.out.println("양수의 합은" +sum);
		scanner.close();
	}
}
