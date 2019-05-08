package project1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField IDText;
	private static JTextField textField_1;

	public static void main(String[] args) {
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
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		
		
		

	}

}
