package thread;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class CountThread extends JFrame {
	private JLabel l1, l2, l3;

	public CountThread() {
		getContentPane().setBackground(new Color(255, 222, 173));
		setTitle("카운트 다운");
		setSize(1000, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l1 = new JLabel("");
		l1.setForeground(Color.PINK);
		l1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 33));
		l1.setBounds(20,10,600,100);
		getContentPane().add(l1);
		l2 = new JLabel();
		l2.setBackground(new Color(255, 228, 181));
		l2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 40));
		l2.setBounds(200,100,300,450);
		getContentPane().add(l2);
		
		(new MyThread()).start();
		(new TimeThread()).start();
		

		setVisible(true);

	}

	class MyThread extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				l1.setText("홍길동의 게임 시작 : " + i + "");
			}
		}
	}


	class TimeThread extends Thread {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
					Calendar cal = Calendar.getInstance();
					l2.setText(cal.getTime() + "");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	
		}
	}	

	public static void main(String[] args) {

		CountThread count = new CountThread();

	}

}
