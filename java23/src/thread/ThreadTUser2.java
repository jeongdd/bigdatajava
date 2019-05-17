package thread;

import java.util.Random;

public class ThreadTUser2{
	
	public static void main(String[] args) {
		ThreadTest3 t3 = new ThreadTest3(); 
		ThreadTest4 t4 = new ThreadTest4(); 
		ThreadTest5 t5 = new ThreadTest5(); 
		
		Random rand = new Random();
		
		t3.run();
		t4.run();
		t5.run();
		
	}
}
