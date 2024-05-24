package question07;
/*
 * String[] 사용
 * 메소드를 호출해서 문자열 변경
 * to be or not to be -> to eat or not to eat
 */
public class ArraryParameterEx {
//	문자 배열을 매개변수로 받아서 출력
	static void printStringArray(String[] a) {		
		for (int i = 0; i < a.length; i++) {		
			System.out.print(a[i]);
		}
		System.out.println();
	}
	//문자열 배열을 매개변수로 받아서 "be"->"eat"으로 변경
	static void replaceBe(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals("be")) {
				a[i]=a[i].replace("be", "eat");
//				a[i]="eat";
			}
			System.out.println(a[i]);
		}		
	}
	public static void main(String[] args) {
		String[] array = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(array);
		replaceBe(array);
		printStringArray(array);
	}
}
