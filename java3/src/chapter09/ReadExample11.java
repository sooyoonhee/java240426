package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
//		Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
//		FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
		Reader reader = new FileReader("D:\\test.txt");//upcasting
		int readData;
		
		while (true) {
			readData= reader.read();//한 개의 문자 단위로 읽는다.
			if (readData == -1) {
				break;
			}
//			System.out.println(readData);//유니코드 값이 출력됨
			System.out.print((char)readData);
		}
		reader.close();
	}
}
