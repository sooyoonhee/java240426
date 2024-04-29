package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int upWide = scanner.nextInt();
		int downWide = scanner.nextInt();
		int high = scanner.nextInt();
		
//		마지막 숫자가 0이면 삼각형의 넓이
		if (high==0) {
			float triangle = (upWide+downWide)/2;
			System.out.println("삼각형의 넓이는 " + triangle);
		} else{
			float trapezium = (upWide+ downWide)*high/2;
			System.out.println("사다리꼴의 넓이는 "+ trapezium);
		}
		
		scanner.close();
	}
}
