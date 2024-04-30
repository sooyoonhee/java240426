package question02;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//적절한 선언위치 찾기....
		System.out.print("점수를 입력하세요(0~100):");
		int num= scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4):");
		int grade= scanner.nextInt();

		if (num>=60) {
			if (grade!=4) {
				System.out.println("합격!");
		} else	if(num>=70) {
				System.out.println("합격!");
		}else {
			System.out.println("불합격!");
		}
		}else {//요 부분 입력 안해서 오류...?
			System.out.println("불합격!");// 원하는 값이 나오지 않음...?	
			scanner.close();
		}
	}
}