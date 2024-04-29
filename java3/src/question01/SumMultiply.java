package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
//		println을 쓰면 입력받는 값(System.in)이 다음 줄에 출력됨.
		System.out.print("2 개의 정수 입력 >>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println("두 수의 합은 " +(x+y));
		System.out.println("두 수의 곱은 " +x*y);

	scanner.close();
	}
	
}
