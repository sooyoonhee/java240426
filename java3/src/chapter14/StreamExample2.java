package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("Java","Stream","Library");
		System.out.println("입력데이터= "+words);//list로 출력
		List<Integer> result= words.stream()//스트림 생성
			.map(String::length)//메소드 참조로 문자열 길이 구함
			.collect(Collectors.toList())//collect : 최종연산
		;
		System.out.println("실행결과="+result);
	}
}
