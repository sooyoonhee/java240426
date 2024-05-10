package question06;

public class BabySum {
	public static void main(String[] args) {
		int baby[][]=new int[120][5];
		int sum=0;
		
//		baby.length : 120(i 120번 반복)
		for (int i = 0; i < baby.length; i++) {
//			baby[i].length :5(country5회 반복)
			for (int j = 0; j < baby[i].length; j++) {
//				101~105, 201~205...12001~12005
//				(0+1)*100+0+1=101, (0+1)*100+0+2=102...105
//				(1+1)*100+0+1=201, (1+1)*100+0+2=202...205
				baby[i][j]=(i+1)*100+j+1;
//				System.out.print(baby[i][j]+ " ");
				sum +=baby[i][j];
			}//System.out.println();
		}
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
	}
}
