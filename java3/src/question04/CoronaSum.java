package question04;


public class CoronaSum {
	public static void main(String[] args) {
		int sum =0;
		int[][]corona= {{11,12,13}
						,{21,22,23}
						,{31,32,33}
						,{41,42,43}
						,{51,52,53}
						,{61,62,63}
						,{71,72,73}
						,{81,82,83}
						,{91,92,93}
						,{101,102,103}
						,{111,112,113}
						,{121,122,123}};
//		//행 기준(1월~12월), corona.length :12
		for (int month = 0; month < corona.length; month++) {
//			//열 기준(3개의 도시), corona[month].length:3
			for (int city = 0; city < corona[month].length; city++) {
				System.out.print(corona[month][city]+" ");
				sum +=corona[month][city];
			}System.out.println();
		}
		System.out.println("1년 전체 코로나 환자 수는 "+sum);
	}
}
//		int[]corona1=new int [12];
//		int[]corona2=new int [12];
//		int[]corona3=new int [12];
//		int sum=0;
//		
//		for (int i = 0; i < corona1.length; i++) {
//			corona1[i]=11+i*10;
//		}
//		for (int i = 0; i < corona2.length; i++) {
//			corona2[i]=12+i*10;	
//		}
//		for (int i = 0; i < corona3.length; i++) {
//			corona3[i]=13+i*10;				
//		}
