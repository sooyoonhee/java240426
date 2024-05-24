package chapter06;

class Point2{
	private int x,y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {//object 클래스
		return "Point2("+x+","+y+")";//오버라이딩해서 문자열로 출력하는 데 사용
	}
}
public class ToStringEx {
	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		//chapter06.Point2@75a1cd57 p 객체의 값을 출력
		System.out.println(p);//chapter06.Point2@75a1cd57 패키지.클래스.16진수 해시코드
		System.out.println(p.toString());//chapter06.Point2@75a1cd57 패키지.클래스.16진수 해시코드
		System.out.println(p.toString()+"입니다.");//chapter06.Point2@75a1cd57 패키지.클래스.16진수 해시코드
	}
}
