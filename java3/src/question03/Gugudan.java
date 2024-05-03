package question03;

public class Gugudan {
	public static void main(String[] args) {
		
		//구구단 : 이중 for문
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int num =i*j;
		//탭으로 띄워서 정렬되게 출력
				System.out.print(i+"*"+j+"="+num+"\t");
		//단이 끝날때마다 엔터
			}//System.out.println();
		}
	}
}
