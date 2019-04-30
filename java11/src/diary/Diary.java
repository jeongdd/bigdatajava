package diary;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Diary {
	private JTextField t1;
	private JTextField t2;
	
	public Diary() {
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.getContentPane().setBackground(new Color(255, 228, 225));
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.setSize(550, 600);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("<<<<<일기작성날짜>>>>>");
		l1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("<<<<<일기작성제목>>>>>");
		label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JLabel label_1 = new JLabel("<<<<<일기작성내용>>>>>");
		label_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		f.getContentPane().add(label_1);
		
		JTextArea t3 = new JTextArea();
		t3.setLineWrap(true);
		t3.setFont(new Font("나눔고딕", Font.BOLD, 24));
		t3.setColumns(23);
		t3.setRows(10);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("SAVE");
		b1.setBackground(new Color(255, 192, 203));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				System.out.println(date);
				System.out.println(title);
				System.out.println(content);
				try {
					FileWriter w = new FileWriter(title + ".txt");
					w.write(date + "\n");
					w.write(title + "\n");
					w.write(content + "\n");
					
					w.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b1.setFont(new Font("Candara", Font.BOLD, 35));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("OPEN");
		b2.setBackground(new Color(255, 222, 173));
		b2.setFont(new Font("Candara", Font.BOLD, 35));
		f.getContentPane().add(b2);
		
		f.setVisible(true);
		
	
	}
}

