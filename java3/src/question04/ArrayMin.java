package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
//		int min=0;
//		2.두번째 방법
		int min=Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수 7개를 입력하세요.");
		int intArray[]=new int[7];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
//			1.첫번째 방법
//			첫번째 반복할 때 무조건 배열원소를 min에 저장
//			if (i == 0) {//두번째 방법시 제외됨.
//				min =intArray[i];
//			}
			if (intArray[i]<min) {
				min =intArray[i];
			}
		}System.out.println("가장 작은 수는 "+min+"입니다.");
		scanner.close();
	}
}
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int[]n=new int[7];
//		System.out.print("양수"+ n.length +"개를 입력하세요.");
//		int number, min=0;
//		
//		for (int i = 0; i < n.length; i++) {
//			number=scanner.nextInt();
//			n[i]=number;
//			if(min>n[i]) {
//				min=n[i];
//			}
//		}System.out.println("가장 작은 수는"+n+"입니다.");
