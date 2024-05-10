package chapter04;

//default 접근지정자
class Calc{
//	static(클래스) 멤버는 객체 생성없이 클래스 이름으로 사용 가능.
//	public static int abs(int a) {
//	non-static(인스턴스) 멤버는 객체 생성해야 사용됨.
//	public int abs(int a) {
//	private 접근지정자는 같은 클래스 안에서만 접근 가능
//	private int abs(int a) {
//	protected 접근지정자는 같은 패키지(chapter04) 안 + 다른패키지(상속)에서만 접근 가능
//	but, static가 붙으면 메소드 이용 가능
	protected static int abs(int a) {
		return a>0? a:-a;//절대값 반환(삼항연산자)
	}
	static int max(int a, int b) {
		return a>b? a: b;//둘 중 큰 수 반환
	}
	public static int min(int a, int b) {
		return a>b? b: a;//둘 중 작은 수 반환
	}
}

//public 접근지정자(제한자)
public class CalcEx {
	public static void main(String[] args) {
//		static 멤버로서 객체 생성 없이 접근 가능
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}
}
