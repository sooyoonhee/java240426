package chapter06;

class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class ObjectPropertyEx {
	//접근제한자 리턴타입 메소드(매개변수)
	public static void print(Object obj) {//Object obj =new Point(2, 3) -> 업캐스팅
//		실행중인 클래스
		System.out.println(obj.getClass());//class chapter06.Point
//		getName() : 클래스 이름(클래스의 위치?)
		System.out.println(obj.getClass().getName());//chapter06.Point
//		hashCode() : 
		System.out.println(obj.hashCode());//1694819250 : 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString());//chapter06.Point@6504e3b2 : 패키지.클래스@16진수 해시코드
		System.out.println(obj);//toString() 생략(문자열로 변환해서 출력)

	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
