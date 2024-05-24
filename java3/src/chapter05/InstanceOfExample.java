package chapter05;

public class InstanceOfExample {
	public static void method1(Parent parent) {
//		Parent parent = new Child(); => child 객체를 판단
//		instanceof : 객체가 해당 클래스 타입인지 판단(참/거짓)
		if (parent instanceof Child) {
//			downcasting
			Child child = (Child) parent;
//			System.out.println("성공");
			System.out.println("method1 - Child 로 변환 성공");
		}else {
			System.out.println("method1 - Child 로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
//		Parent parent = new Parent(); => Parent 객체를 판단
		Child child = (Child) parent;
		System.out.println("method2 - Child 로 변환 성공");
	}
	public static void main(String[] args) {
//		upcasting
		Parent parentA = new Child();
		method1(parentA);//성공
		method2(parentA);//성공? if문을 안쓰고 출력만 했으니 당연히 출력되지 않나...?

		Parent parentB = new Parent();
		method1(parentB);//실패
//		method2(parentB);//예외 발생

		Parent parentC = new Parent();
//		위의 메소드 호출과 동일(오류가 없는 것 같은데 실행시 오류 발생)
		Child child =(Child) parentC;//예외 발생(강제 변환)
//		method2(parentC);//실패
//		upcasting을 먼저 하고 downcasting 한 경우만 적용
	}
}
