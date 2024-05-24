package chapter05_2;

//기본폰, 전화를 걸어서 100초동안 응답이 없으면 타임아웃
//전화거는 기능, 받는 기능, 화면에 폰이라고 출력
interface PhoneInterface{
//	public static final int TIMEOUT=100;
	int TIMEOUT=100;//public static final 생략해도 같은 상수
//	public abstract void sendCall();//추상메소드
	void sendCall();//추상메소드//public abstract 생략 가능
	void reciveCall();
	default void printLogo() {//default(일반메소드)는 구현해야 함.
		System.out.println("** Phone **");
	}
}

//삼성폰을 만들때 기본 폰 기능을 사용(전화 걸고, 받는 것)
class SamsungPhone implements PhoneInterface{
//추상메소드 오버라이딩(구현) 2개
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void reciveCall() {
		System.out.println("전화가 왔습니다.");
	}
//	삼성폰 고유의 기능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone =new SamsungPhone();
		phone.printLogo();//인터페이스 상속받아서 사용
		phone.sendCall();//추상메소드 구현해서 사용
		phone.reciveCall();//추상메소드 구현해서 사용
		phone.flash();//삼성폰 고유의 기능
	}
}
