package question06;
/*
 * 난수를 발생 Math(클래스), Random(클래스)
 */
public class RandomNumber {
	public static void main(String[] args) {
		int rNumber = 0;


		while (rNumber!=7) {
				rNumber =(int)(Math.random()*10+1);
				System.out.println(rNumber);			
		}
		
	}
}
//			do {
//				rNumber =(int)(Math.random()*10+1);
//				System.out.println(rNumber);
//		}while(rNumber!=7);
