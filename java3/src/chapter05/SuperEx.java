package chapter05;
/*
 * super()를 사용
 */
class Point2{
	private int x,y;//4.(0,0) 저장 //D.(5,6) 저장
	public Point2() {//2.슈퍼클래스 생성자 호출
		this.x = this.y = 0;//x,y의 값이 모두 0 //3.멤버 저장		
	}
	public Point2(int x, int y) {//B.(5,6)
		this.x = x; this.y = y;//C.멤버 저장
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}//같은 패키지 안에 같은 클래스명있을 경우 오류가 남.(저장시 오류 발생)

class ColorPoint2 extends Point2{
	private String color;//6. blue 저장

	//매개변수 3개를 가진 생성자
	public ColorPoint2(int x, int y,String color) {//1.(5, 6, "blue")
		super(x, y);//A.(5,6)
		this.color = color;//5. 멤버 저장
	}
	public void showColorPorint() {
		System.out.println(color);
		showPoint();
	}
}
public class SuperEx {
	public static void main(String[] args) {
//		객체 생성, 0, 0, blue 셋팅
		ColorPoint2 cp= new ColorPoint2(5, 6, "blue");
		cp.showColorPorint();
	}
}
