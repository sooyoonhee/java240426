package chaper02;

import java.util.Scanner;

/*
 * 점수를 입력받아 80점 이상이면 합격, 아닐 경우 불합격
 */
public class SuccessOrFail {
	public static void main(String[] args) {
		System.out.print("점수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
//		if(score >= 80) {
//			System.out.println("축하합니다! 합격입니다.");
//		}
//		if(score >= 80) { }(중괄호) 생략해도 출력 O
//			System.out.println("축하합니다! 합격입니다.");
//		if(score >= 80) 
//			System.out.println("축하합니다!");
//			System.out.println("합격입니다.");
			if(score >= 80) System.out.println("축하합니다! 합격입니다.");

		scanner.close();
	}
}
