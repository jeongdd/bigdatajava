package thread;

public class ThreadTest1 extends Thread {
	
	public void run() {
		for (int i = 1; i < 101 ; i++) {
			System.out.println("증가 : " + i);			
		}
	};
}
