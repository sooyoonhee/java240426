package chaper02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=10;
		
//		연산 결과는 큰타입으로. int형으로 변환
		System.out.println(b+i);
//		정수 기본타입 int로 연산
		System.out.println(10/4);
//		실수 큰타입으로 계산됨(double/int)
		System.out.println(10.0/4);
//		실수 연산으로 결과는 실수
		System.out.println(2.9+1.8);
//		2 + 1.8 =실수_실수→정수 강제변환시 소숫점 부분은 잘림.
		System.out.println((int)2.9+1.8);
//		2+1
		System.out.println((int)2.9+(int)1.8);
//		결과값인 4.7을 정수로 변환
		System.out.println((int)(2.9+1.8));	
	}
}
