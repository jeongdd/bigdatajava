package control;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보그래픽 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(363,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 26));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("바위");
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 26));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("보");
		b3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 26));
		f.getContentPane().add(b3);
		
		textField = new JTextField();
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(0:가위, 1:바위, 2:보) : ");
		int me = sc.nextInt();
		
		Random random = new Random();
		int com = random.nextInt(3);
		System.out.println("컴퓨터는 " + com);
		
		String win = null;
		if(me==0) { // 가위
			if(com==0) {
				win="비겼습니다.";
			}else if(com==1) {
				win = "컴퓨터 승리";
			}else {
				win = "내가 승리";
			}
		}
		if(me==1) { // 바위
			if(com==0) {
				win="내가 승리";
			}else if(com==1) {
				win = "비겼습니다.";
			}else {
				win = "컴퓨터 승리";
			}
		}
		if(me==2) { // 보
			if(com==0) {
				win="컴퓨터 승리";
			}else if(com==1) {
				win = "내가 승리";
			}else {
				win = "비겼습니다.";
			}
		}
		System.out.println(win);
		
		f.setVisible(true);
	}
		
}



