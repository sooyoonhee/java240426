package question01;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner = new Scanner(System.in);
		int season = scanner.nextInt();
		
		if (3<=season&&season<=5) {
			System.out.println("봄");
		} else if(6<=season&&season<=8) {
			System.out.println("여름");
		}else if(9<=season&&season<=11) {
			System.out.println("가을");
		}else if(13<=season){
			System.out.println("해당 계절은 없습니다.");
			// or 연산자로 변수가 12이거나 1이거나 2 이면 겨울이라고 선언
			// 그 뒤에 else 에는 해당 계절이 없다고 출력하도록 만들 수 있음.
		}else {
			System.out.println("겨울");
		}
		scanner.close();
	}
}
