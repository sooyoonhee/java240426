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
