package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 컬렉션에서 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		List<String> list =new ArrayList<>();//List에 커서 위치하고 Ctrl+T : 패키지의 구성을 계층 구조로 볼 수 있음.
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		//2번 인덱스에 삽입되어서 2번이 밀려남 =>3.Servlet/JSP
		list.add(2, "Database");//add(,):해당 인덱스 위치에 값을 삽입(기존 값은 다음 인덱스로 넘어감)
		list.add("Spring");
		
		int size=list.size();
		System.out.println("총 list 갯수: "+size);//총 list 갯수: 5
		
		String skill=list.get(2);
		System.out.println("2번째 인덱스: "+skill);//2번째 인덱스 : Database
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
			/*
			 * 0: Java
			 * 1: JDBC
			 * 2: Database
			 * 3: Servlet/JSP
			 * 4: Spring
			 */
		}
		System.out.println();
		list.remove(2);//인덱스로 객체를 삭제(2번인덱스 값이 사라지고 뒤의 인덱스 값들이 앞으로 옴)
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		System.out.println();
		list.remove("Spring");//객체를 직접 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
