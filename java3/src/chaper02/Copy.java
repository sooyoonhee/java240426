package chaper02;

public class Copy {
	public static void main(String[] args) {
//		String 타입
//		origin : 변수(명)
//		String 타입의 변수 선언
//		String origin;
//		origin 변수의 초기값 설정		
		String origin = "가나다라";
		String copy = origin;
		System.out.println(origin);
		System.out.println(copy);
		
			copy = copy + "마바사";
			System.out.println(copy);
	}
}
