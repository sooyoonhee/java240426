package question03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		boolean multiple=false;//int number 선언, boolean multiple 선언 및 초기화 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요:" );
		int number = scanner.nextInt();
//		3의 배수(아닌 경우(5의 배수 or not (8의 배수 or not)))
//		if else if 혹은 if else가 만능은 아니다.
//		단순 if문만 사용
		if (number%3==0) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}
		if (number%5==0) {
			System.out.println("5의 배수이다.");
			multiple=true;
		}
		if (number%8==0) {
			System.out.println("8의 배수이다.");
			multiple=true;
		}
//		3, 5, 8 배수의 조건이 하나도 아닐 때
		if (multiple==false) {
			System.out.println("어느 배수도 아니다.");
		}
		scanner.close();
	
	}
}
//		if (number>=0) {
//			if (number%3==0) {
//				System.out.println("3의 배수이다.");
//			} else if (number%5==0) {
//				System.out.println("5의 배수이다.");	
//			} else if(number%8==0){
//				System.out.println("8의 배수이다.");	
//		}else {
//			System.out.println("어느 배수도 아니다.");
//		}
//		}
