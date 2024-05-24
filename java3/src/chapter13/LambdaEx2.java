package chapter13;

interface MyFunction2{
	int calc(int x);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 squre=x -> x*x;
		System.out.println(squre.calc(3));
	}
}
