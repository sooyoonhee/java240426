package question03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		System.out.print("연산(띄어쓰기를 사용해 입력하시오.)>>");
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		String op = scanner.next();
		int n2 = scanner.nextInt();
		int result = 0;
		
//		if(n2!=0) {	
//		switch (op) {
//		case "+":
//			result = n1 + n2; //case와 결과를 한 줄로 작성해도 O
//			break;
//		case "-":
//			result = n1 - n2;
//			break;
//		case "*":
//			result = n1 * n2;
//			break;
//		case "/":
//			result = n1 / n2;
//			break;
//		default:
//			System.out.println("사칙연산이 아닙니다.");
//			scanner.close();
//			return;
//		}
//		}else {
//			System.out.println("0으로 나눌 수 없습니다.");
//			scanner.close();
//			return;
//
//		}
		
		switch (op) {
		case "+": result = n1 + n2; //case와 결과를 한 줄로 작성해도 O
			break;
		case "-": result = n1 - n2;
			break;
		case "*": result = n1 * n2;
			break;
		case "/":
			if (n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");				
				scanner.close();
				return;
			} else {
			result = n1 / n2;
			}break;
		default:
			System.out.println("사칙연산이 아닙니다.");
			scanner.close();
			return;
		}
		System.out.println(n1+op+n2+"의 계산 결과는 "+ result);
		scanner.close();
	}
}
