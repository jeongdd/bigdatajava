package ex1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Restaurant {
	private static JTextField num;
	private static JTextField totalM;
	static int totalN = 0;
	static int total = 0;
	
	public static void main(String[] args) {
		String menu[] = {"img.gif","c1.jpg","c2.jpg","c3.jpg"};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.RED);
		
		f.setTitle("중식 메뉴선택");
		f.setSize(1200,900);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton img = new JButton();
		img.setFont(new Font("굴림", Font.PLAIN, 14));
		
		ImageIcon icon = new ImageIcon(menu[0]);
		img.setIcon(icon);
		
		
		
		JButton b1 = new JButton("짜장");
		b1.setBackground(new Color(255, 255, 0));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[1]);
				img.setIcon(icon);
				total += 5000;
				totalN ++;
				totalM.setText(Integer.toString(total));
				num.setText(Integer.toString(totalN));
				
			}
		});
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("짬뽕");
		b2.setBackground(new Color(255, 255, 0));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[2]);
				img.setIcon(icon);
				total += 5000;
				totalN ++;
				totalM.setText(Integer.toString(total));
				num.setText(Integer.toString(totalN));
			}
		});
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("볶음밥");
		b3.setBackground(new Color(255, 255, 0));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[3]);
				img.setIcon(icon);
				total += 5000;
				totalN ++;
				totalM.setText(Integer.toString(total));
				num.setText(Integer.toString(totalN));
			}
		});
		b3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b3);
		
		JLabel l1 = new JLabel("개수");
		l1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		f.getContentPane().add(l1);
		
		num = new JTextField();
		num.setFont(new Font("Dialog", Font.PLAIN, 18));
		f.getContentPane().add(num);
		num.setColumns(10);
		
		JLabel l2 = new JLabel("총 금액");
		l2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		f.getContentPane().add(l2);
		
		
		totalM = new JTextField();
		totalM.setFont(new Font("Dialog", Font.PLAIN, 18));
		totalM.setColumns(10);
		f.getContentPane().add(totalM);
		
		
		f.getContentPane().add(img);
		System.out.println(total);
		
		
		f.setVisible(true);
		
	}

}
