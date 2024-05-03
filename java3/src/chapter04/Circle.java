package chapter04;

public class Circle {
	//멤버변수(필드)
	int radius;
	String name;
	
//	오버로딩 : 같은 이름이지만 다르게 작동하는 메소드
//	일반 메소드도 매개변수만 다르다면 오버로딩 가능
	//Circle() : 메소드
	public Circle() {}//클래스와 이름이 같은 메소드 : 생성자(기본)
	public Circle(int a) {}//클래스와 이름이 같은 메소드 : 생성자(매개변수 1개)
	public Circle(int a, int b) {}//클래스와 이름이 같은 메소드 : 생성자(매개변수 2개)
	
	public double getArea() {//멤버함수(메소드)
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;//참조변수(태명과 비슷...?) 선언, Circle 이 클래스(객체를 생성하는 틀/판)
//		new Circle();//객체 생성//이름없는 Circle
		pizza = new Circle();//객체 생성 + 이름 선언//이름이 pizza
		pizza.radius = 10;//pizza는 객체, radius는 필드(값이 없으면 오류발생)//멤버변수 값 셋팅
		pizza.name="자바피자";//멤버변수 값 셋팅
		pizza.getArea();//멤버함수 호출
		
		double area = pizza.getArea();//멤버함수 호출
		System.out.println(pizza.name+"의 면적은 "+area);//멤버변수 값 사용
		
		Circle donut= new Circle();//객체 생성 //이름이 donut
		donut.radius=2;
		donut.name="자바도넛";//필드에 값 셋팅
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);//멤버변수 값 사용
		
	}
}
