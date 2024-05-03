package question03;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String args[]) {//(String[] args) : 배열 =>입력값을 바로 받을 수 있음.
		Scanner scanner = new Scanner(System.in);
		System.out.print("부정행위 여부(true 혹은 false):");
		boolean cheating = scanner.nextBoolean();
		System.out.print("출석률(0~100 사이의 정수값):");
		int attendrate =scanner.nextInt();
		System.out.print("총점(0~100 사이의 정수값):");
		int totalscore=scanner.nextInt();
		char grade;

		if (cheating) {//cheating은 불리언 타입. ( ) 속 실행값이 기본 
			grade = 'F';
		} else if(attendrate < 80) {
			grade = 'F';
		}else {
			if (totalscore>=90) {
				grade='A';
			} else if (totalscore>=80) {
				grade='B';
			} else if (totalscore>=70) {
				grade='C';
			} else if (totalscore>=60) {
				grade='D';
			}else {
				grade = 'F';				
			}
		}
		
		
//		if (cheating==false) {
//			if (attendrate<80) {
//				grade = 'F';
//			} else if(attendrate>=80) {
//			 if(totalscore>=90){
//					grade='A';
//				}else if(totalscore>=80) {
//					grade='B';
//				}else if(totalscore>=70) {
//					grade='C';
//				}else if(totalscore>=60) {
//					grade='D';
//				}else {
//					grade='F';
//				}
//		}
//		}else {
//			grade='F';
//			
//		}
		System.out.println("학점= "+grade);
		scanner.close();
	}
}
		
		
		
		
//		if() {
//		}else if(cheating !=true) {
//		switch (totalscore/10) {
//		case 10:
//		case 9:
//			grade ="A";
//			break;
//		case 8:
//			grade ="B";
//			break;
//		case 7:
//			grade ="C";
//			break;
//		case 6:
//			grade ="D";
//			break;
//		default:
//			grade = "F";
//			break;
//		}
//		}
//		}

