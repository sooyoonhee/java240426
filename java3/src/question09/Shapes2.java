package question09;

class Oval implements Shape{
	private int width; int height;
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return PI*0.5*width*0.5*height;
//		return PI*0.25*width*height;//같은 공식
	}
}
class Rect implements Shape{
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	@Override
	public double getArea() {
		return width*height;
	}
	
}
public class Shapes2 {
	public static void main(String[] args) {
	Shape [] list = new Shape[3];
	list[0]=new Circles(10);
	list[1]=new Oval(20,30);
	list[2]=new Rect(10,40);
	
	for (int i = 0; i < list.length; i++) {
		list[i].redraw();
	}
	for (int i = 0; i < list.length; i++) {
		System.out.println("면적은 "+list[i].getArea());
	}
	}
}
