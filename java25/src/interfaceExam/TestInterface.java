package interfaceExam;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestInterface extends JFrame implements ActionListener {

	JButton b1,b2,b3;
	
	public TestInterface() {
		setSize(300,300);
		
		b1 = new JButton("1.click!!");
		b2 = new JButton("2.click!!");
		b3 = new JButton("3.click!!");
		
		add(b1);
		add(b2);
		add(b3);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestInterface test = new TestInterface();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("1번을 선택하셨습니다.");
		} else if(e.getSource() == b2) {
			System.out.println("2번을 선택하셨습니다.");
		} else {
			System.out.println("3번을 선택하셨습니다.");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
