package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//배열을 생성했다면 입력할 숫자 칸을 배열의 길이로 지정하면 수정 용이.
		System.out.print("5개의 정수를 입력하세요>>");
		int[] array = new int [5];
		int sum=0;
//		double sum=0;
		
		for (int i = 0; i < array.length; i++) {
//			int number=scanner.nextInt();
//			sum+=number;
			array[i]=scanner.nextInt();
			sum +=array[i];
		}
			
//		double average = sum/array.length;
		System.out.println("평균은"+(double)sum/array.length);
//		System.out.println("평균은"+average);
		scanner.close();
	}
}
