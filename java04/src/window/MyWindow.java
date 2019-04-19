package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
//J~ (꾸러미들) => swing 

public class MyWindow {

	public static void main(String[] args) {
		// 프레임
		JFrame f = new JFrame("입력값 받는 프로그램");
		f.setSize(499,212);
		
		//물 흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		JButton button = new JButton("나를 눌러요.");
		button.setBackground(Color.WHITE);
		button.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 16));
		button.setForeground(Color.ORANGE);
		JLabel label1 = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label1.setForeground(Color.PINK);
		label1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		JTextField text1 = new JTextField(20);	// 아래에 get.Text를 인식시키기 위해
		text1.setBackground(new Color(255, 228, 225));
		text1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		JLabel label2 = new JLabel("당신이 주로 사용하는 개발 툴을 입력하세요.");
		label2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		label2.setForeground(new Color(255, 127, 80));
		JTextField text2 = new JTextField(20);	
		text2.setBackground(new Color(255, 218, 185));
		text2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		
		f.getContentPane().setLayout(flow);
		
		// 버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요!!");
				String data1 = text1.getText();
				System.out.println("당신의 주요 과목은 :" + data1);
				String data2 = text2.getText();
				System.out.println("당신의 사용하는 개발 툴은 : " + data2);
			}
		});
		// 글자들
		// 입력받는 화면(한 줄 짜리)
		
		f.getContentPane().add(label1);
		f.getContentPane().add(text1);
		f.getContentPane().add(label2);
		f.getContentPane().add(text2);
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}
}
