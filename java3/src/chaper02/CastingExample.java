package chaper02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue =44032;
//		int 타입을 char로 저장하려고 하면 오류가 발생함
//		char charValue=intValue;
//		char로 변환(casting)해서 저장
		char charValue=(char)intValue;
		System.out.println(charValue);
		
//		정수 작은 타입에서 큰 타입으로 변환(자동변환=>묵시적 변환)
//		long longValue=500;
//		5000999888L에서 L/l을 안 붙이면 int로 인식해서 오류
		long longValue=5000999888L;
//		정수 큰타입에서 작은 타입으로 변환(변환 안하면 오류)
		intValue = (int) longValue;
//		long 타입 숫자가 int로 변환할때 잘려서 706032592로 저장
		System.out.println(intValue);
		
		
		double doublValue=3.14;
//		실수에서 정수로 변환(변환 안하면 오류)
		intValue = (int) doublValue;
//		3.14에서 소수점이 잘려서 3으로 출력됨
		System.out.println(intValue);
		
	}
}
