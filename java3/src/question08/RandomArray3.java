package question08;

import java.util.Scanner;

public class RandomArray3 {
//	난수의 중복체크하는 메소드
	public static boolean exists(int a[], int to, int r) {
		//0: 반복안함, 1: 중복아님, 2:중복
//		for (int i = 0; i < 1; i++) { a[0] == 33
//		for (int i = 0; i < 2; i++) { a[0] == 33, a[1] == 33
		for (int i = 0; i < to; i++) {
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();//ex>24
		int array[]=new int[n];//배열크기가 24
		boolean yn=false;
		
		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100+1);//1~100까지의 난수를 발생
			//i=0, r=23, i=1, r=33, i=2, r=33
//			if (exists(array, i, r)) {
//				i--;
//				continue;.
//			}

			for (int j = 0; j < i; j++) {
//				System.out.println("@#01 array["+j+"]===>"+array[j]);
				if (array[j] == r) {
					yn=true;
					break;
				}else {
					yn=false;
				}
			}

			if (yn) {
				i--;
				continue;
			}
			
//			array[0]=23
//			array[1]=33
			array[i]=r;
//			System.out.println("@#02 array["+i+"]===>"+array[i]);
			if (i == 0) {//첫번째는 엔터 안친다.
				System.out.print(array[i]+" ");
			} else {
				if(i%10 == 0) {//10번째마다 엔터 친다.
					System.out.println();
				}
				//10번째아닐때마다 엔터 안친다.
				System.out.print(array[i]+" ");
			}
		}
	}
}
















