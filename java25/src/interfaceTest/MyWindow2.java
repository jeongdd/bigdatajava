package interfaceTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame implements ActionListener{  // 상속도 받고 implements도 구현 가능

	public MyWindow2() {
		setSize(300, 300);
		JButton b = new JButton("나를 눌러요");
		add(b);
//		ActionProcess action = new ActionProcess();
		b.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow2 win = new MyWindow2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());  // console창에 데이터를 출력
	}

}
