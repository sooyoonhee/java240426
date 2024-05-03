package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
//		상수 100달러 원화 계산
		final int HUNDRED = 120000;
		final int TEN = 12000;
		int res, money, num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하세요>>");
		num = scanner.nextInt();
		
		if (num==1) {
			money=400000;
		} else if(num==2){
			money=600000;
		} else if(num==3){
			money=800000;
		}else {
			money=1000000;
		}
		res = money/HUNDRED;
//		100달러 짜리가 1매 이상일 때
		if (res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
//		나머지 돈을 다시 셋팅
		money = money%HUNDRED;
//		10달러 계산
		res = money/TEN;
//		10달러짜리가 1매 이상일 때
		if (res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int dollor = 1200;
//		System.out.print("가구수를 입력하시오>>");
//		Scanner scanner = new Scanner(System.in);
//		int who=scanner.nextInt();
//		int money;
//		
//		switch (who) {
//		case 1:
//			money = 400000;
//			break;
//		case 2:
//			money = 600000;
//			break;
//			case 3:
//			money = 800000;
//			break;
//		default:
//			money = 1000000;
//			break;
//		}
//		int give = money/(dollor*100);
//
//		if (give>0) {
//		System.out.println("100달러짜리 "+give+"매");
//		}
//		give = money %(dollor*100);
//		give = give/(dollor*10);
//		if(give>0) {
//		System.out.println("10달러짜리 "+give+"매");	
//	}scanner.close();
//	}
//}
