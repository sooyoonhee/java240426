package chapter07;

public class Box {
	private Object object;//레퍼런스변수//"홍길동", 777//애플 객체

	public Object get() {
		return object;
	}
//	Object object="홍길동" //upcasting
//	Object object="777"//upcasting
//	Object object=new "Apple"//upcasting
	public void set(Object object) {
		this.object = object;
	}
}
