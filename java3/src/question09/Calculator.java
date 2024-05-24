package question09;

import java.util.Scanner;
abstract class Clac{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	abstract int caculate();
}

class Add extends Clac{
	@Override
	public int caculate() {return a+b;}
}

class Sub extends Clac{
	@Override
	public int caculate() {return a-b;}
}

class Mul extends Clac{
	@Override
	public int caculate() {return a*b;}
}

class Div extends Clac{
	@Override
	public int caculate() {return a/b;}
	
}
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		String operator=scanner.next();//chatAt(0)??
		
		Clac exp=null;
		switch (operator) {
//		case "+": Add add = new Add(); break;
//		case "-": Sub sub = new Sub(); break;
//		case "*": Mul mul = new Mul(); break;
//		case "/": Div div = new Div(); break;
		case "+": exp = new Add(); break;
		case "-": exp = new Sub(); break;
		case "*": exp = new Mul(); break;
		case "/": exp = new Div(); break;
		default:
			System.out.println("잘못된 연산자입니다.");
			scanner.close();
			break;
		}
		exp.setValue(a, b);
		if (exp instanceof Div && b ==0) {
			System.out.println("계산할 수 없습니다.");
		} else {
			System.out.println(exp.caculate());
		}
		scanner.close();
	}
}
