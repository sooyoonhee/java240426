package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");//upcasting
		int readData;
		char[] cbuf=new char[2];
		String data="";
		
		while (true) {
//			readData= reader.read();//한 개의 문자 단위로 읽는다. ex>호미
			readData= reader.read(cbuf);//두 개의 문자 단위로 읽는다. ex>삽
			if (readData == -1) {
				break;
			}
//			System.out.print((char)readData);
			data += new String(cbuf,0,readData);
		}
		System.out.println(data);
		
		reader.close();
	}
}
