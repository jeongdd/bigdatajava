package thread;

public class ThreadTest4 extends Thread {
	
	public void run() {
		for (int i = 1; i < 3; i++) {
			System.out.print("☎");
		}
	};
}
