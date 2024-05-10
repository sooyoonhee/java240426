package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner scanner =new Scanner(System.in);
		String alphabet=scanner.next();
		char c =alphabet.charAt(0);
		
		for (char i=c; i >='a'; i--) {
//				System.out.print(i);
				for (char j='a';  j<=i ;j++) {
				System.out.print(j);
				}System.out.println();
		}
////		for (char i = 'a'; i <= c; i++) {//c입력했을 때 abc 계속 반복
//		for (char i = c; i >= 'a'; i--) {//-1씩 감소하면서 이전 알파벳 출력
////			for (char j = 'a'; j <= c; j++) {//c까지만 반복
//			//입력받은 알파벳으로부터 하나씩 이전 알파벳으로 반복 출력
//			for (char j = 'a'; j <= i; j++) {//c까지만 반복
//				System.out.print(j);
//			}System.out.println();
//		}
//		
		scanner.close();
	}
}


//				for (char i=c; i >='a'; i--) {//입력한 알파벳에서 a까지
//					System.out.print(i);
//			}
//		for (char i='a'; i <= c ; i++) {//입력한 알파벳까지 소문자 알파벳 출력
//				System.out.print(i);
//			}
		
//		for (int i=(char)c; 'a' != c;) {
//			for (int j=(char)c; 'a' <= c; j--) {
//				System.out.print(j);
//			}System.out.println();
//		}
