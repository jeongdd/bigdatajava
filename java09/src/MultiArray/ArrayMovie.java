package MultiArray;

import java.awt.FlowLayout;
//import java.awt.Image;
//import java.net.URL;
//import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArrayMovie {

	public static void main(String[] args) {
		String movies[] = {"m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG"} ;
//		JButton buttons[] = new JButton[100]; // 버튼이 아닌 버튼이 들어갈 자리를 100개 만들어놓음
				
		// 자바는 필요한 부분의 부품(class)을 복사해서
		// 조립해서 코딩하는 방식
		// 부품(객체, 대상)조립식 프로그램
		// 객체지향형 프로그래밍(Object-Oriented Program : OOP)
		
//		Color.red : static(정적) -> 원본그대로
//		new Button : instance -> 카피해서 사용 
		//부품의 특징 - 보이는 성질, 행동하는 성질
		
		JFrame f = new JFrame(); 
		f.getContentPane().setBackground(new Color(255, 255, 204));
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(226, 580);
		// 물 흐르듯이 하나씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img	 = new JButton();
		img.setBackground(new Color(255, 204, 204));
		f.getContentPane().add(img);
		//이미지 처리 복사 클래스
		ImageIcon icon = new ImageIcon("m1.png");
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<<< 생일 >>>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
			}
		});
		b1.setForeground(new Color(153, 0, 204));
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<< 헬보이 >>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		b2.setForeground(new Color(153, 0, 204));
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("< 돈(money) >");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		b3.setForeground(new Color(153, 0, 204));
		b3.setBackground(Color.ORANGE);
		b3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("<<파이브피트>>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		b4.setForeground(new Color(153, 0, 204));
		b4.setBackground(Color.ORANGE);
		b4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("<<<< 어스 >>>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		b5.setForeground(new Color(153, 0, 204));
		b5.setBackground(Color.ORANGE);
		b5.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		f.getContentPane().add(b5);
		
		//객체화 : 객체로 만들어서 String을 인식시켜줌
//		URL url = new URL("http://www.naver.com");
//		File file = new File("c:/temp/test.txt");
//		PreparedStatement sql 
//			= new PreparedStatement("select");
		
		
		
		f.setVisible(true);
	}

}
