package thread;

public class ThreadTest5 extends Thread {
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("♤");
		}
	};
}
