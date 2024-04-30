package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈 : "+n);
	}
//	매개변수가 없는 메소드(주사위 숫자 구하기 = 1~6)
	public static int rollDie() {
//		random() : 0 이상 1 미만 난수 발생(실수)
//		Math.random();
//		random() : 0 이상 6 미만 난수 발생(실수)
		double x = 6 * Math.random();
//		0~5까지의 난수
		int tem = (int)x;
//		1~6 의 난수를 반환
		return tem +1;
		
		
//		Math 클래스/메소드 호출시에는 import문 생성 X
//		Scanner 클래스 이용 시에는 import문 생성
//		원래 다른 클래스에 있는 메소드 사용 시에는 import문 발생, 
	}
}
