package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWIndow2 {

	public static void main(String[] args) {
		//#6
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setTitle("자바 프로젝트 시작");
		
		JButton b1 = new JButton("자바 프로젝트");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음 주 부터 자바프로젝트가 시작됩니다.");
			}
		});
		
		f.getContentPane().add(b1);
		f.setVisible(true);
		
	}

}
