package chaper02;

public class EscapeExample {
	public static void main(String[] args) {
//		sysoInvalid escape sequence
//		(valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
//		System.out.println("번호 ￦t이름 작업");
//		
		System.out.println("번호 이름 작업");
//		백슬래시t : 탭만큼 띄움
//		println : 출력시 엔터 적용
		System.out.println("번호 \t이름\t 작업");
//		print : 엔터 적용 안됨
		System.out.print("번호 \t이름\t 작업");
//		백슬래시n : 엔터(다음행)
		System.out.print("번호 \t이름\r 작업\n");
		
		System.out.print("번호 \t이름\t 작업");
		System.out.println(); //엔터
		System.out.println("우리는 개발자 입니다.");
//		\" : " 출력
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄여름가을겨울");
//		\를 출력하고 싶으면 \\로 사용해야 함
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
