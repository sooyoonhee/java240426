package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int mideum; // 초기화를 해 놓고 시작해야 하나?
		
		if((n1<n2)&&(n2<n3)) {
			mideum = n2;
			}else if ((n1<n3)&&(n2>n3)) {
				mideum = n3;
			}else{
				mideum = n1;
			}
		System.out.println("중간 값은 " + mideum);
		
		scanner.close();
	}
}	
		
/*		int midian=0;
		if ((a>b && a<c)||(a>c && a<b)) {
			midian=a;
		} else if((b>a && b<c)||(b>c && b<a)){ 
			midian=b;
		}else {
			midian=c;
		}
		System.out.println("중간 값은 "+midian);
		scanner.close;
		} //강사님 해설 부분.
*/
