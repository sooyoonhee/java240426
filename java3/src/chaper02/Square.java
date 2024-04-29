package chaper02;

//1. public class 를 찾아감
public class Square {
//	viod : 리턴 타입(리턴[반환] 할 것이 없다)
//2.main 메소드 찾아감
	public static void main(String[] args) {
		int n=4;
//		square();//메소드 호출부
//		square(4);//메소드 호출부
//3.메소드 호출
//		square(n);//메소드 호출부
		int s = square(n);//메소드 호출부
		System.out.println("한 변의 길이가 "+n+"인 정사각형의 넓이 : "+s);
	}
//	square : 메소드명(호출부에서 파라미터가 있으면 오류)

//	public static void square() {//메소드 정의부
//	public static void square(int n) //메소드 정의부
//	int length : int 타입의 매개변수(인자 , 파라미터) : n->length로 받음
//	public static void square(int length) { //메소드 정의부
//	int : 리턴 타입
//4.메소드 호출됨
	public static int square(int length) { //메소드 정의부
//		return;
//		return"";//타입 불일치시 오류(String)
//		return 0;//타입 불일치시 오류(int)
//5.length 를 제곱해서 반환
		return length*length;
	}
}
