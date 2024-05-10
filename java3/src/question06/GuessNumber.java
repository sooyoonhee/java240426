package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int numberToGuess;
		int guess;
		
		Random generator=new Random();
		numberToGuess = generator.nextInt(10)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
		
		while (guess!=numberToGuess) {
				System.out.println("추측한 숫자가 틀렸습니다.");
			if (guess>numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}else if(guess<numberToGuess) {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			System.out.print("추측한 숫자를 입력하세요: ");
			guess = scanner.nextInt();	
		}
		System.out.println("맞추셨습니다.");
		scanner.close();
		
	}
}
		
		
		
//		Scanner scanner = new Scanner(System.in);//방법 1, 2 공통 사용
//		int numberToGuess=(int)(Math.random()*10+1);
//		int guess=0;
		
//		while (guess!=numberToGuess) {
//			System.out.print("추측한 숫자를 입력하세요(1~10): ");
//			guess = scanner.nextInt();
//			if (guess>numberToGuess) {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 큽니다.");
//			}else if(guess<numberToGuess) {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 작습니다.");
//			}
//		}
//		System.out.println("맞추셨습니다.");
//		scanner.close();

//		do {
//			System.out.print("추측한 숫자를 입력하세요(1~10): ");
//			guess = scanner.nextInt();
//			if (guess>numberToGuess) {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 큽니다.");
//			}else if(guess<numberToGuess) {
//				System.out.println("추측한 숫자가 틀렸습니다.");
//				System.out.println("추측한 숫자가 너무 작습니다.");
//			}			
//		} while (guess!=numberToGuess);
//		System.out.println("맞추셨습니다.");
//		scanner.close();
