package question03;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum=0, i = 0;
//		do {
//		i++;//마지막에서 오류가 발생함. 마지막 값 100이 if 조건에 부합하므로 100을 포함한 값이 출력됨.
//			if(i%2==0) {
//				sum +=i;
//		}
//		}while (i<=100);
//	System.out.println(sum);
//	do {
//		if(i%2==0) {
//			sum +=i;
//		}i++;
//	} while (i<=99);
//	System.out.println(sum);
//		do {                //강사님 해설 식
//			if(i>99) {
//				break;
//			}
//			sum +=1;
//			i+=2;
//		} while (true);
	do {
//		i%2==0;
		i +=2;
	} while (i<=99);
	System.out.println(sum);
	}
}
