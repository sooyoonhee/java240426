package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []unit= {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int res = money/unit[i];	
			if (res>0) {
				System.out.println(unit[i]+"원 짜리 : "+res+"개");
				money =money%unit[i];
			}
		scanner.close();
		}
	}
}
		
//		int []change= new int[8];
//		for (int i = 0; i < unit.length; i++) {
//			if(i==0) {
//			change[i]=money/unit[i];
//			}else {
//			change[i]=money%unit[i-1]/unit[i];
//			}
//		}
//		for (int i = 0; i < change.length; i++) {
//			if(change[i]!=0) {
//			System.out.println(unit[i]+"원짜리 : "+change[i]+"개");
//			}
//		}
//		scanner.close();
//	}
//}

//if (money >= unit[0]) {
//	System.out.println("50000원 짜리 : "+money/unit[0]+"개");
//	System.out.println("10000원 짜리 : "+money%unit[0]/unit[1]+"개");
//} else {
//	System.out.println("10000원 짜리 : "+money/unit[1]+"개");
//}
//		System.out.println("50000원짜리 : "+change[0]+"개");
//		System.out.println("10000원짜리 : "+change[1]+"개");
//		System.out.println("1000원짜리 : "+change[2]+"개");
//		System.out.println("500원짜리 : "+change[3]+"개");
//		System.out.println("100원짜리 : "+change[4]+"개");
//		System.out.println("50원짜리 : "+change[5]+"개");
//		System.out.println("10원짜리 : "+change[6]+"개");
//		System.out.println("1원짜리 : "+change[7]+"개");