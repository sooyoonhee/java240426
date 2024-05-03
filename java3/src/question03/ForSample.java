package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum =0;
	
//		for (int i = 1; i <11; i++) {
//			sum += i;
//			if (i==10) {
//				System.out.println(i+"="+sum);
//			}else {
//				System.out.print(i+"+");	
//			}
//		}	
		
		for (int i = 1; i <=10; i++) {
			if(i<=9) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"=");				
			}
			sum+=i;
		}System.out.println(sum);
	}
}
