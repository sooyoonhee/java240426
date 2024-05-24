package question08;

public class Div {
	int a;
	int b;
	public void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public int caculate() {
		int res = 0;
		try {
			res=a/b;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return res;
	}

}
