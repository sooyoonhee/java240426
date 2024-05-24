package question08;

import java.util.Scanner;

public class RandomArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수 몇개(100 이하만 가능)? ");
	int n=scanner.nextInt();
	int []array=new int[n];
	
	for (int i = 0; i < array.length; i++) {
		int r=(int)(Math.random()*100)+1;//1~100사이의 난수를 발생
		array[i]=r;//해설에선 값을 한번 받고 대입
		System.out.print(array[i]+" ");
		if (i%10==9) {
			System.out.println();
//		if (i==0) {//첫번째는 엔터를 안 치도록
//		System.out.print(array[i]+" ");
//		} else {
//		if (i%10==0) {//10번째마다 엔터를 침
//			System.out.println();
//		}
//		System.out.print(array[i]+" ");
//	}
		}
	}
	scanner.close();
}
}
