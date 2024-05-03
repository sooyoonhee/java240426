package question04;

public class IrregularArray {
	public static void main(String[] args) {
//		int [][] array = {{10,11,12},{20,21},{30,31,32},{40,41}};
//		비정방형 배열 : 행만 정의하고 열은 비워둠
		int [][] array = new int[4][];
		array[0]=new int [3];//1행(array[0])의 열의 크기는 3
		array[1]=new int [2];//2행(array[1])의 열의 크기는 2
		array[2]=new int [3];//3행(array[2])의 열의 크기는 3
		array[3]=new int [2];//4행(array[3])의 열의 크기는 2

//		4번 반복
		for (int i = 0; i < array.length; i++) {//행의 크기만큼 반복
//			3,2,3,2번 반복
			for (int j = 0; j < array[i].length; j++) {//열의 크기만큼 반복
				array[i][j] = (i+1)*10+j;
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
	}
}
