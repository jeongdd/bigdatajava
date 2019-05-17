package thread;

public class ThreadTest3 extends Thread {
	
	public void run() {
		for (int i = 1; i < 9; i++) {
			System.out.print("★");
		}
	};
}
