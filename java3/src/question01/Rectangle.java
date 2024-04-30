package question01;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.print("점(x,y)의 좌표를 입력하시오>>");
		int x1 = 100; //직사각형 기준 좌표1(x1,y1)
		int x2 = 200;//직사각형 기준 좌표2(x2,y2)
		int y1 = 100;//직사각형 기준 좌표1(x1,y1)
		int y2 = 200;//직사각형 기준 좌표2(x2,y2)
		Scanner scanner= new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (((x1<=x)&&(y1<=y))&&((x<=x2)&&(y<=y2))) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		} else {
			System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
		}
	scanner.close();	
	}
}
/* 좌표값이 고정되어 있는 경우, 따로 선언하지 않고 바로 비교해도 됨.
 * 	if(x>=100 && x<=200 && y>=100 && y<=200) {
 *}	System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
 *	} else {
 *	System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
 *}
 */
