package daodto;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField IdText;
	private JTextField TitleText;
	private JTextField ContentText;
	private JTextField EtcText;
	public BbsMain() {
		JFrame f = new JFrame("나의 게시판 만들기");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(288,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("<아이디>");
		l1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(l1);
		
		IdText = new JTextField();
		IdText.setBackground(new Color(255, 218, 185));
		IdText.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 21));
		f.getContentPane().add(IdText);
		IdText.setColumns(10);
		
		JLabel l2 = new JLabel("<<제 목>>");
		l2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(l2);
		
		TitleText = new JTextField();
		TitleText.setForeground(new Color(221, 160, 221));
		TitleText.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 21));
		TitleText.setColumns(10);
		TitleText.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(TitleText);
		
		JLabel l3 = new JLabel("<<내 용>>");
		l3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(l3);
		
		ContentText = new JTextField();
		ContentText.setForeground(new Color(221, 160, 221));
		ContentText.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 21));
		ContentText.setColumns(10);
		ContentText.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(ContentText);
		
		JLabel l4 = new JLabel("<<기 타>>");
		l4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 22));
		f.getContentPane().add(l4);
		
		EtcText = new JTextField();
		EtcText.setForeground(new Color(221, 160, 221));
		EtcText.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 21));
		EtcText.setColumns(10);
		EtcText.setBackground(new Color(255, 218, 185));
		f.getContentPane().add(EtcText);
		
		JButton b1 = new JButton("ID 검색");
		b1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 18));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = IdText.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				IdText.setText(id);
				TitleText.setText(title);
				ContentText.setText(content);
				EtcText.setText(etc);
				
			}
		});
		f.getContentPane().add(b1);
		
		f.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		BbsMain name = new BbsMain(); 
	}
}
