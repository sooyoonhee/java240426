package chapter07;

//	T=Tv, M=String
public class Product<T, M> {
//	T=Tv, M=String
	//3.new Tv()
	private T kind;
	//3.model = "스마트TV"
	private M model;
	//T=Tv 매개변수의 리턴타입
	public T getKind() {//값을 반환
		return kind;
	}
	//T=Tv 매개변수의 타입
	//1. Tv kind = new Tv()
	public void setKind(T kind) {//값을 멤버에 저장
		this.kind = kind;//2. new Tv()
	}
	//M=String 매개변수의 리턴타입
	public M getModel() {
		return model;
	}
	//M=String 매개변수의 타입
	//1.String model = "스마트TV"
	public void setModel(M model) {
		this.model = model;//2. model = "스마트TV"
	}
	
}
