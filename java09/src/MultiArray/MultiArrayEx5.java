package MultiArray;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MultiArrayEx5 {

	public static void main(String[] args) {
		String cat[] = {"cat1.jpg","cat2.jpg","cat3.jpg"};
		JFrame f = new JFrame();
		f.setTitle("고양!!!!!!!!!!");
		f.setSize(500, 1000);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton name = new JButton();
		
		
		f.setVisible(true);
	}
}
