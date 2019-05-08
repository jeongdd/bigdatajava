package project1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {
	private static JTextField IdT;
	private static JTextField PwT;
	private static JTextField NameT;
	private static JTextField EmailT;
	private static JTextField HomeT;
	private static JTextField GenderT;
	private static JTextField AgeT;
	
	
	public SignUp() {
		JFrame f = new JFrame();
		f.setSize(253, 405);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Dialog", Font.BOLD, 22));
		f.getContentPane().add(lblId);
		
		IdT = new JTextField();
		IdT.setFont(new Font("Dialog", Font.PLAIN, 23));
		f.getContentPane().add(IdT);
		IdT.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(lblPw);
		
		PwT = new JTextField();
		PwT.setFont(new Font("Dialog", Font.PLAIN, 23));
		PwT.setColumns(10);
		f.getContentPane().add(PwT);
		
		JLabel lblName = new JLabel("이름");
		lblName.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		f.getContentPane().add(lblName);
		
		NameT = new JTextField();
		NameT.setFont(new Font("Dialog", Font.PLAIN, 23));
		NameT.setColumns(10);
		f.getContentPane().add(NameT);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 11));
		f.getContentPane().add(lblEmail);
		
		EmailT = new JTextField();
		EmailT.setFont(new Font("Dialog", Font.PLAIN, 23));
		EmailT.setColumns(10);
		f.getContentPane().add(EmailT);
		
		JLabel lblHome = new JLabel("주소");
		lblHome.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		f.getContentPane().add(lblHome);
		
		HomeT = new JTextField();
		HomeT.setFont(new Font("Dialog", Font.PLAIN, 23));
		HomeT.setColumns(10);
		f.getContentPane().add(HomeT);
		
		JLabel label_4 = new JLabel("성별");
		label_4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		f.getContentPane().add(label_4);
		
		GenderT = new JTextField();
		GenderT.setFont(new Font("Dialog", Font.PLAIN, 23));
		GenderT.setColumns(10);
		f.getContentPane().add(GenderT);
		
		JLabel label_5 = new JLabel("나이");
		label_5.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		f.getContentPane().add(label_5);
		
		AgeT = new JTextField();
		AgeT.setFont(new Font("Dialog", Font.PLAIN, 23));
		AgeT.setColumns(10);
		f.getContentPane().add(AgeT);
		
		JButton btnNewButton = new JButton("회원등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WalletMemDAO dao = new WalletMemDAO();
				WalletMemDTO dto = new WalletMemDTO();
				String id = IdT.getText();
				String pw = PwT.getText();
				String name = NameT.getText();
				String email = EmailT.getText();
				String home = HomeT.getText();
				String gender = GenderT.getText();
				int age = Integer.parseInt(AgeT.getText());
				
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setEmail(email);
				dto.setHome(home);
				dto.setGender(gender);
				dto.setAge(age);
				
				dao.insert(dto);
				
			}
		});
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 16));
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
		
	}
}
