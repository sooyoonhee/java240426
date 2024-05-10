package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
//		System.out.print("랜덤한 정수들 : ");
//		int []array = new int [10];
//		double sum=0;
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i]=(int)(Math.random()*10+1);//1~10까지의 난수 발생+저장
//			System.out.print(array[i]+" ");
//			sum +=array[i];//배열 원소 누적합계
//		}
//		System.out.println();
//		System.out.println("평균은 "+sum/array.length);

		System.out.print("랜덤한 정수들 : ");
		Random number=new Random();
		int [] array=new int[10];
		double sum=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=number.nextInt(10)+1;
			sum +=array[i];
			System.out.print(array[i]+" ");
		}
//		System.out.println();
		System.out.println("\n평균은 "+sum/array.length);
	}
}
