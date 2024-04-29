package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		
//		10의 자리 : 나누기 10을 해서 몫
//		1의 자리 : 나누기 10을 해서 나머지
//		int ten = n/10; 10의 자리와 1의 자리를 선언을 해도 됨.
//		int one = n%10;
//		다른 조건 : num%11 = 0 으로 잡아도 됨
		
		if ((num/10) == (num%10)) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
	}
}
