package question08;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
//		String ex=scanner.next();
		char operator = scanner.next().charAt(0);
		
		switch (operator) {
		case '+':
			Add add= new Add();
			add.setValue(num1, num2);
			System.out.println(add.caculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.caculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.caculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.caculate());
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		scanner.close();
	}
}
//if (ex =="+") {
//	c=new Add();
//	(Add)c.setValue(num1,num2);
//}else if(ex =="-"){
//	c=new Sub();
//	
//}else if(ex =="*"){
//	c=new Mul();
//	
//}else if(ex =="/"){
//	c=new Div();
//	
//}else{
//	System.out.println("사칙연산이 아닙니다.");
//}
