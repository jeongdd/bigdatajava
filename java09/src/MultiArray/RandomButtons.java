package MultiArray;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class RandomButtons {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 153, 153));
		f.setTitle("Random Bottons!!!!!");
		f.setSize(1000,900);
		
		f.getContentPane().setLayout(null); // 배치부품을 쓰지 않겠다.(아무 자리에나 버튼이 생김)
		
		// 버튼 들어갈 자리 100개를 만들어둠.
		JButton buttons[] = new JButton[400];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼" + i);
		}
		
		Random rand = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = rand.nextInt(800);
			int y = rand.nextInt(800);
			buttons[i].setBounds(x, y, 150, 50);
			f.getContentPane().add(buttons[i]);
		}
		
		
		f.setVisible(true);
	}

}
