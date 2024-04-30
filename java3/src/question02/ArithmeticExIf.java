package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
	System.out.print("연산>>");
	Scanner scanner = new Scanner(System.in);
	int n1 = scanner.nextInt();
	String arit = scanner.next();
	int n2 = scanner.nextInt();
	int result =0;
	
	if (arit.equals("+")) {
		result = n1+n2;
	} else if(arit.equals("-")){
		result = n1-n2;		
	} else if(arit.equals("*")){
		result = n1*n2;				
	}else if(arit.equals("/")) {
		if (n2!=0) {
			result = n1/n2;
		} else {
			System.out.println(n2+"으로 나눌 수 없습니다.");
//			프로그램 종료
			scanner.close();
			return;
		}
		}else {
		System.out.println("사칙연산이 아닙니다.");
		scanner.close();
		return;	
	}
		
		System.out.println(n1 + arit + n2+"의 계산 결과는 "+result);
	scanner.close();
}
}
