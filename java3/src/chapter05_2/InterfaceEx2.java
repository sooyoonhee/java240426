package chapter05_2;

interface PhoneInterface2{
	int TIMEOUT=100;//public static final 생략해도 같은 상수
	void sendCall();//추상메소드//public abstract 생략 가능
	void reciveCall();
	default void printLogo() {//default(일반메소드)는 구현해야 함.
		System.out.println("** Phone **");
	}
}
//PCS(ex>016,018,019)
//인터페이스 간의 상속 -> extends 사용
//문자를 보내고 받는 기능을 추상메소드로 선언
interface MobilePhoneInterface extends PhoneInterface2{
	void sendMS();
	void receiveMS();
	
}
//MP3 플레이어 : 음악재생, 정지 기능을 추상메소드로 선언
interface MP3Interface{
	void play();
	void stop();
}
//PDA 기기 : 계산 기능을 메소드로 구현
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}
//아이폰 : 계산기능, 문자기능, 음악기능을 상속받음
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void reciveCall() {
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");		
	}

	@Override
	public void sendMS() {
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveMS() {
		System.out.println("문자 왔어요.");
		
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone =new SmartPhone();
		phone.printLogo();//인터페이스 상속받아서 사용
		phone.sendCall();//추상메소드 구현해서 사용
		phone.play();//음악을 연주합니다.
		System.out.println(phone.calculate(3, 5));//8
		phone.schedule();//일정 관리합니다.
	}
}
