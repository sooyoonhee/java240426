package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money =scanner.nextInt();
		int res;
		
		final int 오만원=50000;
		final int 만원=10000;
		final int 천원=1000;
		final int 오백원=500;
		final int 백원=100;
		final int 오십원=50;
		final int 십원=10;
		final int 일원=1;
		
		res=money/오만원;
		if(res>0) {
			System.out.println("오만원권"+res+"매");
			}
		money=money%오만원;
		res=money/만원;
		if(res>0) {
			System.out.println("만원권"+res+"매");
			}
		money=money%만원;
		res=money/천원;
		if(res>0) {
			System.out.println("천원권"+res+"매");
			}
		money=money%천원;
		res=money/오백원;
		if(res>0) {
			System.out.println("오백원권"+res+"개");
			}
		money=money%오백원;
		res=money/백원;
		if(res>0) {
			System.out.println("백원권"+res+"개");
			}
		money=money%백원;
		res=money/오십원;
		if(res>0) {
			System.out.println("오십원권"+res+"개");
			}
		money=money%오십원;
		res=money/십원;
		if(res>0) {
			System.out.println("십원권"+res+"개");
			}
		money=money%십원;
			res=money/일원;
			if(res>0) {
				System.out.println("일원권"+res+"개");
				}
			scanner.close();
	}
}
			
		
		
		
//		int fivemi = money/50000;
//		n=money%50000;
//		int onemi = n/10000;
//		n= n%10000;
//		int thou =n/1000;
//		n=n%1000;
//		int fivehu = n/500;
//		n = n%500;
//		int hund = n/100;
//		n = n%100;
//		int fiveten = n/50;
//		n = n%50;
//		int ten = n/10;
//		n = n%10;
//		int one = n;
//		
//		if (fivemi>0) {
//			System.out.println("오만원권"+fivemi+"매");}
//		if (onemi>0) {
//			System.out.println("만원권"+fivemi+"매");}
//		if (thou>0) {
//			System.out.println("천원권"+thou+"매");}
//		if (fivehu>0) {
//			System.out.println("오백원권"+fivehu+"매");}
//		if (hund>0) {
//			System.out.println("오만원권"+hund+"매");}
//		if (fiveten>0) {
//			System.out.println("오십원권"+fiveten+"매");}
//		if (ten>0) {
//			System.out.println("십원권"+ten+"매");}
//		if (one>0) {
//			System.out.println("일원권"+one+"매");
//		}

//		int fivemi = money/50000;
//		int onemi = money-money*fivemi/10000;
//		int thou =((money-money*fivemi)%10000)/1000;
//		int fivehu = ((money-money*fivemi)%10000)%1000/500;
//		int hund = (((money-money*fivemi)%10000)%1000)%500/100;
//		int fiveten = ((((money-money*fivemi)%10000)%1000)%500)%100/50;
//		int ten = (((((money-money*fivemi)%10000)%1000)%500)%100)%50/10;
//		int one = (money-money*fivemi)%10000%1000%500%100%50%10;