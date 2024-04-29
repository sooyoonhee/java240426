package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int hun = n/100; //100자리수 : 나누기 100의 몫
		int ten = (n%100)/10; //10자리 수 : 나누기 100의 나머지를 10으로 나눈 몫
		int one = (n%100)%10; //1자리 수 : 10자리 수의 나머지
				
		System.out.println("100의 자리와 10의 자리의 합은 "+(hun+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
		scanner.close();
	}
}
