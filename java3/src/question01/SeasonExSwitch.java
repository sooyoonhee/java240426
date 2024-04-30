package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		String season=null;//string을 지정하지 않고 바로 출력해도 됨.
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			season ="봄";//string 지정 x + System.out.println+"";
			break;
		case 6 : //case : case : case : 로도 가능
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			season = "가을";
			break;
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";
			break;
		default:
			System.out.println("해당 계절이 없습니다.");
			break;
		}
		if(season!=null){// string season을 선언하지 않았다면 사용하지 않아도 됨.
			System.out.println(season);
		}
		scanner.close();
	}
}
