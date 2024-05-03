package chapter03;
/*
 * 열거형 이용(+values() 메소드 이용)
 * foreach문 이용
 */
//enum Week{월, 화, 수,목,금,토,일}; //public class 밖에서도 생성, 사용 가능
public class ForeachEx {
//	열거형 : inner class(내부 클래스) 형태
	enum Week{월, 화, 수,목,금,토,일};
	public static void main(String[] args) {
		int [] n= {1, 2, 3, 4, 5 };
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int sum =0, sum1=0;
		
//		int 타입 배열원소 n을 k로 하나씩 받는다.
		for(int k : n) {
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은" +sum);

		for (int i = 0; i < n.length; i++) {
			sum1 += n[i];
			System.out.print(n[i]+" ");
		}
		System.out.println("합은" +sum1);
		
		
		
		for (String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
//		Week 타입 값을 day로 하나씩 받는다.
		for (Week day : Week.values()) {
//			열거형 값을 String 타입으로 받을 수 없음
//			String str = day;//오류
			Week str = day;
//			System.out.print(day+"요일 ");
			System.out.print(str+"요일 ");
		}
		
	}
}
