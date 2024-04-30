package chapter03;
/*
 * 문자열에서 특정 문자를 찾는다.
 * 찾은 갯수를 출력
 * ex> life is cool. (l->2개)
 */
public class ContinueTest {
	public static void main(String[] args) {
		int count=0;
//		알파벳 n의 갯수 구하기
		String s= "no news is good news";
		
//		스페이스 포함해서 20자
//		length() : 문자열의 크기를 구하는 메소드
//		System.out.println(s.length());
		
//		문자열 크기 20번 반복
		for (int i = 0; i < s.length(); i++) {
//			s.charAt(0) : s의 첫번 째 문자
//			charAt : 문자를 가져오는 메소드
//			System.out.println(s.charAt(0));
//			System.out.println(s.charAt(i));
			
//			알파벳n이 아니면 스킵
			if (s.charAt(i) != 'n') {
				continue;
			}
//			알파벳 n이면 카운트 증가
			count++;
		}
		System.out.println("문장에서 발견된 n의 개수 : "+count);
	}
}
