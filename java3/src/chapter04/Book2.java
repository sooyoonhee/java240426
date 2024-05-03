package chapter04;

public class Book2 {
	String title;
	String author;
	public Book2(String title, String author) {
		System.out.println("생성자 1 호출됨");
//		매개변수를 this 자기자신의 객체 멤버로 저장
		this.title=title;
		this.author=author;
	}
	public Book2(String title) {
	//this 는 첫번째 라인에 안 오면 오류 발생
		this(title, "작자미상");//매개변수 2개 -> 생성자 1 호출?
		System.out.println("생성자 2 호출됨");
	}
	public Book2() {
		//this 는 첫번째 라인에 안 오면 오류 발생
		this("a", "b");//매개변수 2개 ->
		System.out.println("생성자 3 호출됨");
	}
	void show() {
		System.out.println(title+" "+author);
	}
	public static void main(String[] args) {
//		new Book("어린왕자", "생택쥐페리");//객체 생성
//		Book2 littlePrince = new Book2("어린왕자", "생택쥐페리");
//		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();
//		System.out.println(littlePrince.title+" "+littlePrince.author);
//		littlePrince.show();
//		loveStory.show();
		emptyBook.show();
	}
}
