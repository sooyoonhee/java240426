package chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
//	throws Exception {//파일이 없거나 주소 오류 등의 예외 발생 대비
	public static void main(String[] args) throws Exception {
//		InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
//		FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
		InputStream is = new FileInputStream("D:\\test.txt");//upcasting
		int readbyte;
		byte[] readBytes=new byte[3];
		String data="";
		
		while (true) {
//			readbyte = is.read();//1byte 단위로 읽는다.(정수로 받음) ex>호미
			readbyte = is.read(readBytes);//3byte 단위로 읽는다.(정수로 받음) ex>삽(한번에 읽는 값이 많아짐)
			if (readbyte == -1) {
				break;
			}
			//문자 3개를 형변환하면서 오류 ex>aaa -> char(한 글자 단위로 변환)
//			System.out.print((char)readbyte);
//			readBytes를 0 인덱스에서 readbyte 길이만큼 읽는다
			data += new String(readBytes, 0, readbyte);
		}
		System.out.println(data);
		is.close();
	}
}
