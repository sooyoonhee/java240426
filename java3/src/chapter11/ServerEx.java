package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket listener=null;//네트워크 통신을 위해 서버 소켓 선언
		Socket socket=null;//클라이언트 소켓 선언
		BufferedReader in = null;//입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;//출력 : 서버에서 보내는 데이터
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener =new ServerSocket(9999);//서버소켓 객체 생성
			System.out.println("연결을 기다리고 있습니다......");
			//소켓 객체로 데이터를 주고 받음
			socket = listener.accept();//클라이언트의 연결을 대기
			//입력 : 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//메소드를 통해 클라이언트의 데이터를 받음
			//출력 : 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String inputMessage = in.readLine();//한 행의 문자열을 읽는다.
				if (inputMessage.equals("bye")) {//클라이언트의 메시지가 bye일 때
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트 : "+inputMessage);//클라이언트에서 온 메시지
				System.out.print("보내기>>");
				String outputMessage =  scanner.nextLine();//서버에서 보내는 메시지
				out.write(outputMessage+"\n");//클라이언트로 메시지 보내기
				out.flush();//비정상적 종료일 때 메시지 재전송
			}
		} catch (Exception e) {
			e.printStackTrace();//예외처리시 시스템에서 자동으로 출력되는 메시지
		}finally {
//			자원 반납(예외 발생까지 고려)
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {//서버와 클라이언트 간의 입출력시 예외 발생 경우
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
