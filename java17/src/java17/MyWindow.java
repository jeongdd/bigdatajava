package java17;

import javax.swing.JFrame;

public class MyWindow extends JFrame{ //클래스 자체가 프레임이 되어버림
	public MyWindow() {
		setTitle("나는 윈도우 프레임");
		setSize(500,600);
		
		MyPanel p = new MyPanel();
		add(p);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
}
