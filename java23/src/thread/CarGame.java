package thread;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread{  // 내부클래스
		// 따로 있을 땐 독립적으로 사용가능
		// CarGame안에 있는 스레드 역할로 사용 가능 -> 독립사용 X
		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public CarThread(String fileName, int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		@Override
		public void run() {
			// for문 x축 random으로 늘려서 경기!!
			// random한 int 값 발생
			// 발생한 int 값을 x축에 더해줌
			// setBounds로 재설된 x축 값으로 위치 지정
			
			for (int i = 0; i < 200; i++) {
				Random rand = new Random();
				x += rand.nextInt(80);
//				x += 50 * Math.random();  // rand.nextInt()와 같은 결과
				System.out.println("x축의 값 : " + x);
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public CarGame() {
		setTitle("나의 스레드 자동자 프로그램");
		setSize(600, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarThread car1 = new CarThread("car1.gif", 100, 0);
		CarThread car2 = new CarThread("car2.gif", 100, 100);
		CarThread car3 = new CarThread("car3.gif", 100, 200);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		CarGame car = new CarGame();
	}
}
