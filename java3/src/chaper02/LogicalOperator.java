package chaper02;

public class LogicalOperator {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		문자끼리 비교는 유니코드 크기로 비교됨
		System.out.println('a'>'b');
		System.out.println('a'<'b');
		
		System.out.println(-1<0);
		System.out.println(3>=2);
		System.out.println("==================");
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		System.out.println("==================");
//		참 && 거짓 = 거짓(and)
		System.out.println((3>2)&&(3>4));
//		참 || 거짓 = 참(or)
		System.out.println((3!=2)||(-1 < 0));
//		참 ^ 거짓 = 참(xor)
		System.out.println((3!=2)^(-1 > 0));
		
	}
}