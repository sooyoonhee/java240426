package question01;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오>>>");
		Scanner scanner= new Scanner(System.in);
		int x = scanner.nextInt();	
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if ((x+y)<z || (x+z)<y || (y+z)<x) {
			System.out.println("삼각형이 안됩니다.");
		} else {
			System.out.println("삼각형이 됩니다.");
		}
		scanner.close();
	}
}