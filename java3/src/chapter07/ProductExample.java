package chapter07;

public class ProductExample {
	public static void main(String[] args) {
//		마지막 < > 파라미터 값 생략 가능(자바 7 이후부터)
		Product<Tv, String> product1= new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv=product1.getKind();//new Tv()
//		chapter07.Tv@3d012ddd(패키지.클래스@해시코드)S
		System.out.println(tv);
		
		String tvModel=product1.getModel();//스마트TV
		System.out.println(tvModel);
		
		Product<Car, String> product2=new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
//		chapter07.Car@5e91993f(패키지.클래스@해시코드)
		System.out.println(car);
		
		String carModel=product2.getModel();
		System.out.println(carModel);
		
	}
}
