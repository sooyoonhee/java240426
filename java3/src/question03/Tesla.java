package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
//		System.out.print("매수 수량을 입력하시오>>");
//		Scanner scanner = new Scanner(System.in);
//		int stockIn=scanner.nextInt();
//		int dollor = 520*stockIn;
//		int hun = dollor/100;
//		int ten = dollor%100/10;
		
		int tesla =520;
		int num;//수량
		int money;//tesla*stockIn
		int res;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num =scanner.nextInt();
		money = tesla*num;
		
//		money를 가지고 100달러 계산
		res = money/100;
//		100달러짜리가 1매 이상일 때
		if(res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
//		100달러를 나누고 난 나머지
		money = money%100;
		
		res = money/10;
//		10달러짜리가 1매 이상일 때
		if(res>0) {
		System.out.println("10달러짜리 "+res+"매");
		}scanner.close();
		

//		if(dollor%100!=0) {
//		System.out.println("100달러짜리 "+hun+"매");
//		System.out.println("10달러짜리 "+ten+"매");
//	}else {
//		System.out.println("100달러짜리 "+hun+"매");
//}scanner.close();
	}
}
