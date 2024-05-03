package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		int []n=new int[10];
		Scanner scanner= new Scanner(System.in);
		System.out.println(n.length+"개의 정수를 입력하세요>>");
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			n[i]= scanner.nextInt();
			sum+=n[i];
		}
		System.out.println("합계는"+sum);
		scanner.close();
	}
}
