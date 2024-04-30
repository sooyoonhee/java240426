package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		int cos = scanner.nextInt();//kospi
		System.out.print("환율을 입력하세요(1100~1200): ");
		int exchange = scanner.nextInt();
		
		if (exchange>=1150) {
			if(2200<=cos){
				System.out.println("상승장");
		}else if(2000<=cos) {
			System.out.println("횡보장");
		}
		}else {
			if (2300<=cos) {
				System.out.println("상승장");				
			} else if(2000<cos) {
				System.out.println("횡보장");			
			}else {
				System.out.println("하락장");
			}
		}
		scanner.close();
	}
}
