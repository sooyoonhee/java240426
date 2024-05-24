package chapter10;

//Runnable 인터페이스 상속받아서 스레드 구현
public class TimerRunnable implements Runnable{
	int n=0;
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);//1초마다 실행
//				예외 발생할 때 e로 catch해서
			} catch (InterruptedException e) {
				// printStackTrace 메소드로 예외처리 기본 메시지를 출력
				e.printStackTrace();
			}
		}
}
}
