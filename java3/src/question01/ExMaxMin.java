package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>>");
		Scanner scanner= new Scanner(System.in);
		int n1 =scanner.nextInt();
		int n2 =scanner.nextInt();
		int n3 =scanner.nextInt();
		int max= 0;
		int min= 0;
		
//	정수 a, b, c 중 최대값 구하기
//if (a>b&&a>c) {
//	max =a;
//} else if (b>a&&b>c) {
//	max =b;
//} else {
//	max =c;
//}
//	정수 a, b, c 중 최대값 구하기
//if (a<b&&a<c) {
//	min =a;
//} else if (b<a&&b<c) {
//	min =b;
//} else {
//	min =c;
//}
		
		
		if (n1<n2&&n2>n3&&n1<n3) {
			max=n2;
			min=n1;
		} else if(n1<n2&&n2>n3&&n1>n3){
			max=n2;
			min=n3;
		} else if(n1>n2&&n2<n3&&n1>n3){
			max=n1;
			min=n2;
		} else if(n1>n2&&n3<n1&&n2>n3){
			max=n1;
			min=n3;
		} else if(n1<n3&&n2<n3&&n1<n2){
			max=n3;
			min=n1;
		}else {
			max=n3;
			min=n2;
		}
		System.out.println("최대값은"+max);
		System.out.println("최소값은"+min);
		scanner.close();
	}
}
