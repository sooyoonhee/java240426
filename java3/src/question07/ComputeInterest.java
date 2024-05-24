package question07;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int principal, years=0;//원금, 연도
		double balance, rate;//원리금, 연이율
		
		System.out.print("원금을 입력하세요: ");
		principal =scanner.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate=scanner.nextDouble();
		balance = principal;
		System.out.println();
		System.out.println("연도수 \t"+"원리금");
		
		do {
			years++;//처음에 years 값이 1로 시작함.
			balance = balance*(1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		} while (balance<=principal*2);
		System.out.println("\n필요한 연도수= "+years);
		scanner.close();
		
		
//		for (years = 1;balance<=principal*2; years++) {
//			balance = balance*(1.0+rate/100.0);
//			System.out.println(years+"\t"+balance);
//			if (balance>principal*2) {
//				System.out.println();
//				System.out.println("필요한 연도수 = "+years);
//			}
//		}
//		scanner.close();
	}
}
