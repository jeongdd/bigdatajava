package thread;

public class ThreadTUser{
	
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		
		t1.start();
		t2.start();
		
	}
}
