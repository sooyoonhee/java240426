package question05;
/*
 * 배열 리턴2(메소드 이용)
 * 일차원 배열 생성(정수1~10)
 * 배열 리턴 -> 배열원소 +100 -> 출력
 */
public class ReturnArray2 {
	public static void main(String[] args) {
		int[]intArray=new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=i+1;
			System.out.print(intArray[i]+" ");
		}	System.out.println();
			
			int []returnArray=makeArray();
		for (int j = 0; j < returnArray.length; j++) {
			System.out.print(returnArray[j]+" ");
		}
	}
	public static int[] makeArray() {
		int sum[]=new int [10];
		for (int i = 0; i < sum.length; i++) {
			sum[i]=i+1+100;
		}
		return sum;
	}
	
}
