package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		f.getContentPane().setBackground(new Color(255, 255, 204));
		f.setSize(344,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("####나의 계산기####");
		lblNewLabel_1.setForeground(new Color(147, 112, 219));
		lblNewLabel_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("숫자 1>> ");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 19));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(new Color(255, 204, 204));
		n1.setForeground(new Color(0, 0, 0));
		n1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자 2>> ");
		label.setForeground(new Color(100, 149, 237));
		label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 19));
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setForeground(new Color(0, 0, 0));
		n2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		n2.setColumns(10);
		n2.setBackground(new Color(255, 204, 204));
		f.getContentPane().add(n2);
		
		JButton b1 = new JButton("두 수를 +");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 + number2);
			}
		});
		b1.setBackground(new Color(255, 204, 153));
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("두 수를 -");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 - number2);
			}
		});
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		b2.setBackground(new Color(255, 204, 153));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두 수를 *");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 * number2);
			}
		});
		b3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		b3.setBackground(new Color(255, 204, 153));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("두 수를 /");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 / number2);
			}
		});
		b4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		b4.setBackground(new Color(255, 204, 153));
		f.getContentPane().add(b4);
		
		
		
		
		
		
		f.setVisible(true);

	}

}
