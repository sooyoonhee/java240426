package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box();//업캐스팅
		box.set("홍길동");
		//down casting(String)
		String name =(String) box.get();
		System.out.println(name);
		
		box.set(777);
		//down casting(int)		
		int number=(int)box.get();
		System.out.println(number);
		
		box.set(new Apple());
		Apple apple =(Apple)box.get();
//		chapter07.Apple@515f550a
//		@ 이후 : 해시코드
		System.out.println(apple);
	}
}
