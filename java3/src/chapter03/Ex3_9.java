package chapter03;
/*
 * 구구단을 배열로 생성
 * 값을 넣어본더 ex>2*7=14, 9*4=36
 */
public class Ex3_9 {
	public static void main(String[] args) {
//		정수 타입의 2차원 배열 선언(1차원은 열로 구성, 1차원이 2개 이상 가지고 행으로 구성)
//		int[][]gugudan;
//		2차원 배열 선언, 생성(9행 9열)
//		int[][]gugudan= new int [9][9];//인덱스 0~8까지
		int[][]gugudan= new int [10][10];//인덱스 0~9까지
		
//		1*1=1~9*9=81
		for (int i = 1; i <= 9; i++) {//행 기준
			for (int j = 1; j <= 9; j++) {//열 기준
//				행렬에 1*1~9*9까지 값을 배열원소로 저장
				gugudan[i][j]=i*j;//i=행, j=열gugudan([i][j])
			}
		}
		System.out.println("2 X 7 ="+gugudan[2][7]);//인덱스를 0을 시작하지 않는 이유 : 원하는 값을 넣으면 바로 출력될 수 있도록 함
		System.out.println("9 X 4 ="+gugudan[9][4]);// 0행,0열 값들은 다 0(기본값/없는 값)이 됨.
	}
}
