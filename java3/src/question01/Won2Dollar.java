package question01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
	System.out.print("원화를 입력하세요(단위:원)>>");
	Scanner scanner = new Scanner(System.in);
//	final double RATE =1100; //환율이 고정인 경우 상수 사용(관습적으로 대문자 사용)
	int won = scanner.nextInt();
//	단순 고정된 수로 나누는 방법, 상수나 선언된 변수 사용 방법 있음.
//	환율의 경우 소수점 계산이 정확해야 되서  double형 사용...
//	double doller = won/(double)1100;
	double doller = exchange(won);
	System.out.println(won+"원은 $"+doller+"입니다.");
	
	scanner.close();
}
	public static double exchange(int won) {
		final double RATE =1100;
		return won/RATE;
	}
}
