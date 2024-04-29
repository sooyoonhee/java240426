package question01;

import java.util.Scanner;
//class 여러 개 사용해도 무관
class a{}
class b{}
//public class : 자바 파일 안에 두개 이상 존재시 오류
//public class c{}
//1. JVM이 수많은 class에서 public class를 찾아감

public class ExCalculation {
//		method 여러 개 생성해도 무관
	public static void c() {}
	public static void ddd(){}
//		2. JVM이 수많은 method에서 main 메소드를 찾아감
	public static void main(String[] args) {

		
		System.out.print("2개의 실수 입력 >>");
		Scanner scanner = new Scanner(System.in);
//		nextFloat()/ nextDouble() : 실수를 받는 메소드
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		System.out.println("두 수의 덧셈은"+(x+y));
		System.out.println("두 수의 뺄셈은"+(x-y));
		System.out.println("두 수의 곱셈은"+x*y);
		System.out.println("두 수의 뺄셈은"+x/y);
		
		scanner.close();
	}
}
