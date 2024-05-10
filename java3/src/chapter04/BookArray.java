package chapter04;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	public Book3(String title,String author) {
		this.title=title;
		this.author=author;
	}
}
public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//book 참조변수가 참조변수 2개를 가리킴
		Book3[] book = new Book3[2];
		
		//book.length : 2
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
//			String title = scanner.next();
			String title = scanner.nextLine();
			System.out.print("저자>>");
//			String author = scanner.next();
			String author = scanner.nextLine();
//			객체를 2번 생성(참조변수 2개)
//			참조변수 :book[0],참조변수 :book[1]
			book[i]=new Book3(title, author);
		}

		for (int i = 0; i < book.length; i++) {
			System.out.println("("+book[i].title+","+book[i].author+")");
		}
	scanner.close();
	}
}
