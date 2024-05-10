package question06;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int [] number =new int [10];
		System.out.print("양의 정수 "+number.length+"개를 입력하시오>>");
		
		for (int i = 0; i < number.length; i++) {
			number[i]=scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int j = 0; j < number.length; j++) {		
			 if (number[j]%3==0) {
				System.out.print(number[j]+" ");
			}
		}
		scanner.close();
	}
}
