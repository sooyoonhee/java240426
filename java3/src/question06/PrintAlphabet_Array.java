package question06;

import java.util.Scanner;

public class PrintAlphabet_Array {
	public static void main(String[] args) {
		char alphabet[] = {'a','b','c','d','e','f','g','h','i',
						  'j','k','l','m','n','o','p','q','r',
						  's','t','u','v','w','x','y','z'};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c =s.charAt(0);
		
		for (int i = 0; i < alphabet.length; i++) {
//			System.out.print(alphabet[i]);
			if (alphabet[i]<=c) {
//				System.out.print(alphabet[i]);
				for (int j = (int)c; j >alphabet.length; j--) {
					System.out.print(alphabet[j]);
				}
			}//System.out.println();
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("소문자 알파벳 하나를 입력하시오>>");
//			String s = scanner.next();
//			char c =s.charAt(0);
//			
//			for (int i = 0; i < alphabet.length; i++) {
////			System.out.print(alphabet[i]);
//				if (alphabet[i]<=c) {
//					System.out.print(alphabet[i]);
//					for (int j = c; j >='a'; j--) {
////					System.out.print(alphabet[j]);
//					}
//				}//System.out.println();
		}
	}
	
}
