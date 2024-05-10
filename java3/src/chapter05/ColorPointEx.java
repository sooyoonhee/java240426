package chapter05;
/*
 * Point 클래스 :(x,y) 한 점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래스(색을 가진 점)
 */
class Point{
	private int x, y;//멤버변수// 4. (1,2)
	public void set(int x, int y) {//setter // 2. (1,2)
//		3. (1,2)
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
//ColorPoint : 서브클래스(자식)
class ColorPoint extends Point {//Point : 슈퍼클래스(부모클래스)
	private String color;//4.("red")
	public void SetColor(String color) {//setter 2.("red")
//		3.("red")
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p=new Point();//객체를 생성, 멤버는 4개, 생성자 호출(기본)
//		1. 메소드 호출
		p.set(1, 2);
		p.showPoint();
		
//		객체를 생성, 멤버는 7개, 생성자 호출(기본) : Point(슈퍼)-> ColorPoint(서브)
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
//		1. red 값을 가지고 메소드 호출
		cp.SetColor("red");//메소드 안 : 매개변수, 객체 참조 : 참조변수
		cp.showColorPoint();
	}
}
