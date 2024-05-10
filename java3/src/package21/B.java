package package21;

public class B {

	public B() {//생성자
		A a = new A();//객체 생성
		a.filed1=2;
		a.filed2=2;
//		private 멤버는 자기클래스 안에서만 접근됨
//		a.filed3=2;//같은 패키지, 다른 클래스라도 private 멤버 호출 X
		
		a.method1();
		a.method2();
//		private 멤버는 자기클래스 안에서만 접근됨
//		a.method3();
		
	}
}
