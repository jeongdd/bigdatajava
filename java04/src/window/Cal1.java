package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Cal1 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField cal;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(255, 222, 173));
		f.getContentPane().setForeground(new Color(51, 102, 0));
		f.getContentPane().setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.setSize(286,256);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("~~~~나의 계산기~~~~");
		lblNewLabel.setForeground(new Color(255, 20, 147));
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 24));
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("숫자 1 ");
		label.setForeground(new Color(255, 153, 0));
		label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(label);
		
		n1 = new JTextField();
		n1.setForeground(new Color(0, 0, 0));
		n1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자 2");
		label_1.setForeground(new Color(255, 153, 0));
		label_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(label_1);
		
		n2 = new JTextField();
		n2.setForeground(new Color(0, 0, 0));
		n2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		
		JLabel label_2 = new JLabel("연산자");
		label_2.setForeground(new Color(153, 102, 204));
		label_2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(label_2);
		
		cal = new JTextField();
		cal.setForeground(Color.BLACK);
		cal.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		cal.setColumns(10);
		f.getContentPane().add(cal);
		
		JButton btnNewButton = new JButton("Go!");
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				String data = cal.getText();
				
				int i = 0;
				if(data.equals("+") || data.equals("-") ||data.equals("*") ||data.equals("/")){
					if(data.equals("+")) {
						i = number1 + number2;
					}else if(data.equals("-")) {
						i = number1 - number2;
					}else if(data.equals("*")) {
						i = number1 * number2;
					}else if(data.equals("/")) {
						i = number1 / number2;
					}
					System.out.println("두 수의 연산 결과는 " + i + "입니다.");
				}else {
					System.out.println("연산할 수 없는 기호입니다.");
				}
			}
		});
		
		btnNewButton.setForeground(new Color(255, 102, 153));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}
}
