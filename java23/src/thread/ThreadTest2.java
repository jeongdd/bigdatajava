package thread;

public class ThreadTest2 extends Thread {
	
	public void run() {
		for (int i = 100; i > 0 ; i--) {
			System.out.println("감소 : " + i);			
		}
	};
}
