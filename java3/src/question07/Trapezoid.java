package question07;

import java.util.Scanner;
/*
 * 사다리꼴 면젹 =0.5*(아랫변+윗변)*높이
 * 필드 : 아랫변, 윗변, 높이
 * 아랫변, 윗변, 높이 입력 받아서 객체에 필드로 접근해서 입력
 */
public class Trapezoid {
	private int down;
	private int up;
	private int height;
//		계산 메소드
		public double getArea() {
			return 0.5*(down+up)*height;// =0.5*(아랫변+윗변)*높이
		}
		
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print(">>");
	Trapezoid a = new Trapezoid();//객체 생성 -> 생성자 호출(기본 생성자 만들어서 호출 <-컴파일러)
	a.down =scanner.nextInt();//객체로 멤버에 접근
	a.up =scanner.nextInt();//객체로 멤버에 접근
	a.height =scanner.nextInt();//객체로 멤버에 접근
	
	System.out.println("사다리꼴의 면적은 "+a.getArea());
	scanner.close();
}
}

//		public double getArea() {
//			return (double)(down+up)*height/2;// =0.5*(아랫변+윗변)*높이
//		}