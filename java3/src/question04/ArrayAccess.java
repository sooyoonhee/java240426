package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		int max = 0;
		Scanner scanner=new Scanner(System.in);
		int intArray[]=new int[5];
		System.out.print("양수 5개를 입력하세요");

		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수 5개를 배열원소에 저장
			intArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]>max) {
				max= intArray[i];
			}
		}System.out.println("가장 큰 수는"+max+"입니다.");
		scanner.close();
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("양수 5개를 입력하세요");
//		int [] number= new int[5];
//		int max=0;
//		
//		for (int i = 0; i < number.length; i++) {
//			number[i]=scanner.nextInt();
//			if(max<number[i]) {
//				max= number[i];
//			}
//		}
//		System.out.println("가장 큰 수는"+max+"입니다.");
//		scanner.close();
	}
}
