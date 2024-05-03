package question04;

public class CoronaSum_Array {
	public static void main(String[] args) {
		int sum=0;
		int[][]corona= new int[12][3];
		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				corona[i][j]=i*10+10+j+1;
				//corona[i][j]=(i+1)*10+j+1;
				System.out.print(corona[i][j]+" ");
				sum +=corona[i][j];
			}System.out.println();
		}
		System.out.println("1년 전체 코로나 환자수는"+sum);
		
		

//	int[]corona1=new int [12];
//	int[]corona2=new int [12];
//	int[]corona3=new int [12];
//	int sum=0;
//	
//	for (int i = 0; i < corona1.length; i++) {
//		corona1[i]=11+i*10;
//	}
//	for (int i = 0; i < corona2.length; i++) {
//		corona2[i]=12+i*10;	
//	}
//	for (int i = 0; i < corona3.length; i++) {
//		corona3[i]=13+i*10;				
//	}
 }
}
