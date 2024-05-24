package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
//		n을 값으로 가지는 객체 생성(inObject: 참조변수/객체)
		Integer inObject = Integer.valueOf(n);//boxing
		Integer inObject2 = n;//auto boxing

//		10 출력
		System.out.println("inObject = "+inObject);
		System.out.println("inObject2 = "+inObject2);
		
//		int m= inObject.intValue()+inObject.intValue();//unboxing
		int m= inObject+inObject;//auto unboxing
		System.out.println("m = "+m);//int type m 출력 = 20
	}
}
