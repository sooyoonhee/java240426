package chaper02;

public class FloatDoubleExample {
	public static void main(String[] args) {
//		오류 : 실수는 기본이 double(정수는 기본이 int)
//		float var1 = 3.14;
		float var1 = 3.14f;
		float var2 = 3.14F; //대소문자 F 모두 사용 가능
		double var3 = 3.14;
		
//		값을 저장시 오류 발생하지 않고, 출력시 잘림
		float var4=0.1234567890f;
		float var5=0.1234567891f;
		float var6=0.123456789123456789f;
		
//		소수점 자리수 제한 없이 값을 가지나 출력시 잘림
//		(소수점 자리수는 double > float)
		double var7=0.123456789123456789;
		double var8=0.123456789123456789123456789;
		
		double var9=3e6;
		float var10=3e6f;		
//		double var11=3e8f; //오류? 값이 이상하게 출력됨. 선언값과 형식이 맞지 않음.
		double var12=2e-3;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
		System.out.println("var10 : " + var10);
//		System.out.println("var11 : " + var11);
		System.out.println("var12 : " + var12);
	}
}
