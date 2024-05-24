package chapter05;

class OuterClass{
	private String secret="Time is money";
//	public String secret="Time is money";
	public OuterClass() {//2. 달걀의 생성자 호출됨.
//		new InnerClass();//3. 노른자 객체 생성
		InnerClass obj = new InnerClass();//3. 노른자 객체 생성
		obj.method();//a.
	}
		public class InnerClass{//내부(중첩 or inner) 클래스
//		private class InnerClass{//내부(중첩 or inner) 클래스
			public InnerClass() {
			System.out.println("내부 클래스 생성자 입니다.");
		}
			//b
			public void method() {
				//노른자에서 달걀의 private 접근
				// c.
				System.out.println(secret);
			}
	}
}
public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass();//1. 달걀 객체 생성
		OuterClass outer = new OuterClass();//1. 달걀 객체 생성
//		outer.secret="";//접근 제한(private이면)
//		private을 안해도 접근 제한
//		new InnerClass();//접근 제한, 노른자 객체 생성(오류)
	}
}
