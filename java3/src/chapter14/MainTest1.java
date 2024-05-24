package chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int sumValue =  Arrays.stream(arr).sum();//배열요소의 합(sum():최종 연산)
		//count() 리턴 타입 : long
		long count =  Arrays.stream(arr).count();//배열 요소가 몇 개나 있는지(count():최종 연산)

		System.out.println(sumValue);
		System.out.println(count);
	}
}
