package question09;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circles implements Shape{
	private int radius;
	public Circles(int radius) {this.radius = radius;}

	@Override//동적바인딩(오버라이딩)
	public void draw() {System.out.println("반지름이 "+radius+"인 원입니다.");}

	@Override
	public double getArea() {return radius*radius*PI;}
	
}
public class Shapes {
	public static void main(String[] args) {
		Shape donut = new Circles(10);//upcasting
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
