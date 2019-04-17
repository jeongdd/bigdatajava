package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setTitle("나의 첫번째 그래픽 프로그램");
		
		JButton b1 = new JButton("나를 눌러주세요!!!!!");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //처리 내용 작성 -> 버튼을 눌렀을 때
				System.out.println("나를 눌렀군요!!!!!");
			}
		});
		f.getContentPane().add(b1); // 버튼을 프레임에 얹어라.
		f.setVisible(true); // 프레임의 디폴트는 false , true로 지정해줘야함.
		
	}

}
