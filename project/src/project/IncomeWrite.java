package project;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncomeWrite {
	private JTextField dateT;
	private JTextField incomeT;
	private JTextField memoT;

	public IncomeWrite() {
		
		String cate[] = {"월       급", "용       돈", "기       타"};
				
		JFrame f = new JFrame("수입 작성 화면");
		f.setSize(409,274);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSkfwk = new JLabel("날    짜 :");
		lblSkfwk.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(lblSkfwk);
		
		dateT = new JTextField();
		dateT.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		f.getContentPane().add(dateT);
		dateT.setColumns(10);
		
		JLabel label = new JLabel("수 입 액 :");
		label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(label);
		
		incomeT = new JTextField();
		incomeT.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		incomeT.setColumns(10);
		f.getContentPane().add(incomeT);
		
		JLabel label_1 = new JLabel("카 테 고 리 :");
		label_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(label_1);
		
		JComboBox combobox = new JComboBox(cate);
		combobox.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		f.getContentPane().add(combobox);
		
		JLabel label_2 = new JLabel("메    모 :");
		label_2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(label_2);
		
		memoT = new JTextField();
		memoT.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		memoT.setColumns(10);
		f.getContentPane().add(memoT);
		
		JButton btnNewButton = new JButton("등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncomeDAO dao = new IncomeDAO();
				IncomeDTO dto = new IncomeDTO();
				
				String date = dateT.getText();
				int income = Integer.parseInt(incomeT.getText());
				String category = (String)combobox.getSelectedItem();
				String memo = memoT.getText();
				
				dto.setDate(date);
				dto.setIncome(income);
				dto.setCategory(category);
				dto.setMemo(memo);
				
				try {
					dao.insertIncome(dto);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				System.out.println("등록완료");
			}
			
		});
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 27));
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}

}




























