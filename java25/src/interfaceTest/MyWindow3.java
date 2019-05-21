package interfaceTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame implements ActionListener{  // 상속도 받고 implements도 구현 가능

	JButton b1,b2;
	
	public MyWindow3() {
		setSize(300, 300);
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		add(b1);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow3 win = new MyWindow3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("나를 눌러요.를 누르셨군요.");
		}else if(e.getSource() == b2) {
			System.out.println("나도 눌러요.를 누르셨군요.");
		}
//		System.out.println(e.getSource()); // 어떤 버튼을 눌렀는지 알려줌(주소값)
//		System.out.println(e.getActionCommand());  // console창에 데이터를 출력
	}

}
