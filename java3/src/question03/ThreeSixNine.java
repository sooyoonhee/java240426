package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("10~99 사이의 정수를 입력하시오>>");
//	int number = scanner.nextInt();
//	int ten = number/10;
//	int one = number%10;
//	if (ten==3||ten==6||ten==9) {
//		if (one==3||one==6||one==9) {
//			System.out.println("박수짝짝");
//		} else if((one!=3||one!=6||one!=9)) {
//			System.out.println("박수짝");
//		}
	int count = 0, num, a, b;
	Scanner scanner = new Scanner(System.in);
	System.out.print("10~99 사이의 정수를 입력하시오>>");
	num = scanner.nextInt();
	
	a = num/10;
	b = num%10;
	if(a%3==0){
		count++;
	}else if(b%3==0 && b!=0) {
		count++;
	}
	
	if (count ==2) {
		System.out.println("박수짝짝");
	}else if(count ==1){
		System.out.println("박수짝");		
	}
	
		
	scanner.close();	
	}
}
