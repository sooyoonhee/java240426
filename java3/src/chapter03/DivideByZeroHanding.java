package chapter03;

import java.util.Scanner;

public class DivideByZeroHanding {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int dividend;
		int divisor;

//		무한반복
		while (true) {
		System.out.print("분자를 입력하시오: ");
		dividend = scanner.nextInt();
		System.out.print("분모를 입력하시오: ");
		divisor = scanner.nextInt();
		
//		불능일 때 정상적인 메시지로 처리
		try {
//			불능이 발생할 수 있는 실행문(오류 발생 가능성이 있는 실행문)
			System.out.println(dividend+"로 나누면 몫은 "+dividend/divisor+"입니다.");
			break;
//			오류 발생시 처리(try에서 발생시)
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
		}
		}
		
//		분자를 입력하시오: 	10
//		분모를 입력하시오: 	0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at chapter03.DivideByZero.main(DivideByZero.java:20)
//		Unreachable code : break를 입력하지 않으면 무한반복되기 때문에 scanner를 끝낼 수 없음
		scanner.close();
	}
}
