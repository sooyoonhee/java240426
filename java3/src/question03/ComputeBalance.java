package question03;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		System.out.print("구매 금액을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int purchaseAmount = scanner.nextInt();
		int balance;

//		구매금액이 30만원 이상일 때
		if (300000<=purchaseAmount) {
//			청구금액은 3만원 할인
			balance = purchaseAmount - 30000;
//			구매금액이 20만원 이상일 때
		} else if(100000<=purchaseAmount) {
//			청구금액은 5천원 할인
			balance = purchaseAmount - 5000;
//			구매금액이 10만원 미만일 때
		} else {
//			청구금액 = 구매금액
			balance = purchaseAmount;
		}
		System.out.println("구매 금액 = "+purchaseAmount);
		System.out.println("청구 금액 = "+balance);
		scanner.close();
	}
}
