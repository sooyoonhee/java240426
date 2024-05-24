package chapter05_1;

//객체 생성시 멤버 5개
//public class Penguin extends Brid{
//extends Brid, Swim : 자바클래스 다중상속 불가
//public class Penguin extends Brid, Swim{//오류
//인터페이스 다중상속 됨.(implements 키워드 사용)
//생명 1개, 날개 2개, 먹는다 + 수영한다(인터페이스)
public class Penguin extends Bird implements Swim2{

	@Override
	public void swim() {
		System.out.println("penguins swim.");
		// TODO Auto-generated method stub
		
	}

//	public void swim() {
//		System.out.println("pengins swim.");
//	}
}
