package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		List<String> slList=new ArrayList<>();
		slList.add("Tomas");
		slList.add("Edward");
		slList.add("Jack");
		
		Stream<String> stream= slList.stream();//스트림 생성
		stream.forEach(s-> System.out.print(s+" "));
		System.out.println("\n------------------");

		//정렬하는 기능(오름차순) -->sorted
		slList.stream().sorted().forEach(s-> System.out.print(s+" "));
		System.out.println("\n------------------");

//		데이터를 변형할 때 사용하는 map --> 길이로 변경
		slList.stream().map(s->s.length()).forEach(n-> System.out.print(n+" "));
		System.out.println("\n------------------");

//		이름의 길이가 5글자 이상인 경우
		slList.stream().filter(s->s.length()>=5).forEach(n-> System.out.print(n+" "));
		System.out.println("\n------------------");
	}
}
