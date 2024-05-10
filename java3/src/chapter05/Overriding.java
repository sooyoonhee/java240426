package chapter05;

class Weapon{
	protected int fire() {//스타크래프트 -파이어벳
		return 1;//기본 공격력 : 1
	}
}
class Cannon extends Weapon{
	@Override//@는 어노테이션(시스템 주석 : 명령어를 줄여줌..?) => 생략해도 문제 없음.
	protected int fire() {
		return 10;//탱크 공격력 : 10
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;//선언과 생성을 따로 적은 건 생성을 편하게 하려고...?
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());//1
		
		weapon =new Cannon();//upcasting
		System.out.println("대포의 살상 능력은 "+weapon.fire());//10
	}
}
