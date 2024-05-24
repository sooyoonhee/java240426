package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample12 {
	public static void main(String[] args) throws Exception  {
		Writer writer = new FileWriter("D:/output12.txt");//upcasting
		char[] data = "홍길동2".toCharArray();
		writer.write(data);
		
		
		
//		for (int i = 0; i < data.length; i++) {
//			//writer 객체에 write 메소드로 "홍길동"을 하나씩 받아서 파일로 저장한다.
//			writer.write(data[i]);
//		}
		writer.close();
	}
}
