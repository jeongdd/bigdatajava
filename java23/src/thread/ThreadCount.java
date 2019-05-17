package thread;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

public class ThreadCount extends JFrame {
	JLabel l1, l2;

	public ThreadCount() {
		setTitle("카운트 다운");
		setSize(800, 300);

		ThreadC c1 = new ThreadC(null, null);
		ThreadC c2 = new ThreadC(null, null);
	}

	public class ThreadC extends Thread {

		private JLabel la1;
		private JLabel la2;

		public ThreadC(JLabel la1, JLabel la2) {
			this.la1 = la1;
			this.la2 = la2;

			l1 = new JLabel("Start1");
			l1.setFont(new Font("Consolas", Font.BOLD, 39));
			l2 = new JLabel();
			l2.setText("홍길동의 게임 시작!");
			l2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
			add(l1);
			add(l2);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setVisible(true);
		}

		@Override
		public void run() {
//				int i = 5000;
			for (int i = 500; i < 0; i--) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				l2.setText("홍길동의 게임 시작 : " + i + "");
				i++;
			}
		}
	}

	public static void main(String[] args) {
		ThreadCount count = new ThreadCount();
	}
}
