package question07;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
//		String name="홍길동/장화/홍련/콩쥐/팥쥐";
		//st 객체는 홍길동,장화,홍련,콩쥐,팥쥐 5개의 토큰을 가진다.
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		while (st.hasMoreElements()) {//hasMoreElements() : 토큰이 있으면 참
			System.out.println(st.nextToken());//nextToken() : 토큰을 꺼내온다.
		}
		
	}
}
