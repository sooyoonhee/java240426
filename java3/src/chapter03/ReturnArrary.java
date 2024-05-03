package chapter03;
/*
 * 배열 리턴(메소드 이용)
 */
public class ReturnArrary {
//	makeArrary():메소드
//	int[] :반환(리턴)타입(리턴을 안하면 오류)
//	Return type for the method is missing : 리턴 타입에 배열 크기를 표시하면 오류
//	static int[4] makeArrary() {
	static int[] makeArrary() {
//		배열 생성시 타입이 불일치시 오류
//		int temp[]=new String[4];
		int temp[]=new int[4];
		
//		temp.length :4
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;//0 1 2 3 temp[i]=배열 원소(값)
		}
		
//		리턴 타입과 반환되는 값의 타입이 일치해야 함
//		return 0;
//		리턴할 때 []를 추가하면 오류
//		return temp[];
		return temp;
	}
	public static void main(String[] args) {
		int intArrary[];//배열 선언
//		makeArrary(); :메소드 호출
		intArrary = makeArrary();
		
		for (int i = 0; i < intArrary.length; i++) {
			System.out.print(intArrary[i]+" ");
		}
		
	}
}
