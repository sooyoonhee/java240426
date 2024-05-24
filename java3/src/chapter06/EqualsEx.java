package chapter06;

class Point3{
	private int x,y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	equals 오버라이딩 해서 객체의 값을 비교
	@Override
	public boolean equals(Object obj) {//object 클래스//upcasting
		Point3 p =(Point3)obj;//downcasting
		if (x == p.x && y ==p.y) {
			return true;
		} else {
			return false;
		}
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
//		equals : 기본은 객체 비교
//		a is not to be b
//		a is equal to b(객체의 값을 비교)
		if (a.equals(b)) {//객체 비교
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is equal not to be b");
		}
//		a is equal not to be c
		if (a.equals(c)) {//객체 비교
			System.out.println("a is equal to c");
		} else {
			System.out.println("a is equal not to be c");
		}
	}
}
