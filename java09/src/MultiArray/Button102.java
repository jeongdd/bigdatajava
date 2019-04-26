package MultiArray;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button102 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("button X 400!!!!!");
		f.setSize(1000,500);
		
		f.setLayout(null); // 배치부품을 쓰지 않겠다.
		
		// 버튼 들어갈 자리 100개를 만들어둠.
		JButton buttons[] = new JButton[400];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼" + i);
		}
		
		buttons[0].setBounds(50, 55, 150, 100);
		f.add(buttons[0]);
		buttons[1].setBounds(200, 55, 150, 100);
		f.add(buttons[1]);
		buttons[2].setBounds(350, 55, 150, 100);
		f.add(buttons[2]);
		buttons[3].setBounds(500, 55, 150, 100);
		f.add(buttons[3]);
		buttons[4].setBounds(650, 55, 150, 100);
		f.add(buttons[4]);
		
		System.out.println(buttons[4].getText());
		f.setVisible(true);
	}

}
