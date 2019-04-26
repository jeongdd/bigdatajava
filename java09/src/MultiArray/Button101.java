package MultiArray;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button101 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("button X 400!!!!!");
		f.setSize(1500,900);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼 들어갈 자리 100개를 만들어둠.
		JButton buttons[] = new JButton[400];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼");
		}
		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		f.setVisible(true);
	}

}
