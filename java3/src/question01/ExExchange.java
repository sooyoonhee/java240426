package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
//		달러와 유로의 환율(rate)이 정해져 있어 선언을 따로 했던 건데 상수 선언 X
		double doller = 1200;
		double eur = 1500;
		double exd=won/doller;
		double exu=won/eur;
		
		System.out.println(won+"원은 $"+exd+"입니다.");
		System.out.println(won+"원은 E"+exu+"입니다.");
		
		scanner.close();
	}
}

//final double DOLLAR_
//전역변수? 메인 메소드 외에도 번역




