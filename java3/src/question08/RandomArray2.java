package question08;

import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?(100 이하 개수) ");
		int n=scanner.nextInt();
		int [] array=new int[n];
		
for (int i = 0; i < array.length; i++) {
	array[i]=(int)(Math.random()*100)+1;
	if(i%10==0){
		System.out.println();
	}
	for (int j = array.length-1; j >= 0; j--) {
		if (array[i]==array[j]) {
			array[i]=(int)(Math.random()*100)+1;
		}
	}
	System.out.print(array[i]+" ");
		}
	scanner.close();
	}
}
