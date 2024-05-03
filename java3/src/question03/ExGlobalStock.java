package question03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		System.out.print("매수금액을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int pur = scanner.nextInt();//purchaseAmount
		System.out.print("매도금액을 입력하세요: ");
		int sel = scanner.nextInt();//saleAmount
		double tras;//transferTax
		
		if (sel>pur) {
			tras = (sel-pur)*0.22;
		} else {
			tras = 0;
		}
		
	System.out.println("양도세 = "+tras);
	scanner.close();		
	}
}
