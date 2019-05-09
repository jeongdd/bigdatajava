package project;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField IDText;
	private static JTextField PwText;

	public static void main(String[] args) {
			
		WalletMemDTO dto = null;
		
		JFrame f = new JFrame("Wallet Login");
		JLabel img = new JLabel();
		
		f.setSize(589, 762);
		f.getContentPane().add(img);
		
		JLabel IDL = new JLabel("ID");
		IDL.setFont(new Font("Dialog", Font.PLAIN, 24));
		f.getContentPane().add(IDL);
		
		IDText = new JTextField();
		IDText.setFont(new Font("Dialog", Font.PLAIN, 24));
		f.getContentPane().add(IDText);
		IDText.setColumns(10);
		
		JLabel PWText = new JLabel("PW");
		PWText.setFont(new Font("Dialog", Font.PLAIN, 24));
		f.getContentPane().add(PWText);
		
		PwText = new JTextField();
		PwText.setFont(new Font("Dialog", Font.PLAIN, 24));
		PwText.setColumns(10);
		f.getContentPane().add(PwText);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String InputID = IDText.getText();
				String InputPw = PwText.getText();
				if(InputID.equals("1")&& InputPw.equals("1")) {
					SelectMenu menu = new SelectMenu();
				}else {
					JOptionPane.showMessageDialog(null, "※회원정보를 확인해주세요※", "회원정보 오류", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		login.setFont(new Font("Consolas", Font.PLAIN, 22));
		f.getContentPane().add(login);
		
		JButton signup = new JButton("Sign Up");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp sign = new SignUp();
				
			}
		});
		signup.setFont(new Font("Consolas", Font.PLAIN, 22));
		f.getContentPane().add(signup);
		ImageIcon icon = new ImageIcon("wallet.PNG");
		img.setIcon(icon);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		
		
		
		f.setVisible(true);
		
		
//		return dto;

	}

}
