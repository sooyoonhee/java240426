package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []num = new int[10];
		int max=0, min=0;
		System.out.println("양수 "+num.length+"개를 입력하세요");
		
		for (int i = 0; i < num.length; i++) {
			num[i]=scanner.nextInt();
			if (max<num[i]) {
				max= num[i];
			}
			if (i==0) {
				min=num[i];
			}if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.print("가장 작은 수는 "+min+"이고,");
		System.out.println("가장 큰 수는 "+max+"이고,");
		System.out.println("최소값+최대값은 "+(max+min)+"입니다.");
		scanner.close();
	}
}
