package interpaceTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame {

	JButton b1, b2;

	public MyWindow3() {
		setSize(300, 300);
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		add(b1);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
//		setLayout(new FlowLayout()); // 한 번만 사용할 땐 이렇게 사용해도 된다.
		
		ActionListener action = new ActionListener() { // action performed 를 구현해야하는 interface -> 객체생성 문법x
			// 익명클래스를 구현해줌
			// 업캐스팅의 대상인 action에 익명클래스를 넣어줌 (엽캐스팅한것)
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요");
			}
		};
		
		b1.addActionListener(action);
		b2.addActionListener(new ActionListener() {  // new Ac~ : 이건 주소값
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두 번째 버튼을 누르셨군요.");
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow3 win = new MyWindow3();
	}

}
