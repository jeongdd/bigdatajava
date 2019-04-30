package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class Login {
	private JTextField id;
	private JTextField pw;

	public Login() {
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		JLabel img = new JLabel();
		f.getContentPane().setBackground(new Color(255, 228, 225));
		f.setSize(600, 800);
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon("diary.jpg");
		img.setIcon(icon);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel idL = new JLabel();
		idL.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 25));
		idL.setText("ID 입력 : ");
		f.getContentPane().add(idL);
		
		JButton b1 = new JButton("로그인 처리");
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memid = id.getText();
				String mempw = pw.getText();
				if(memid.equals("admin")  && mempw.equals("1234")) {
					Diary d = new Diary();
				}else {
					System.out.println("입력된 회원정보가 없습니다.");
				}
			}
		});
		
		id = new JTextField();
		id.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		f.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel pwL = new JLabel();
		pwL.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 25));
		pwL.setText("PW 입력 : ");
		f.getContentPane().add(pwL);
		
		pw = new JTextField();
		pw.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		pw.setColumns(10);
		f.getContentPane().add(pw);
		f.getContentPane().add(b1);
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Login log = new Login();
	
	}
}
