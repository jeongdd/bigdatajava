package project;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectMenu {
	
	public SelectMenu() {
		
		JFrame f = new JFrame("수입 / 지출 선택화면");
		f.setSize(306,150);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel nullL = new JLabel("                                                                    ");
		f.getContentPane().add(nullL);
		
		JLabel lblNewLabel = new JLabel("메뉴를 선택하세요.");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("수입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncomeWrite write = new IncomeWrite();
			}
			
		});
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지출");
		btnNewButton_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 23));
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		f.setVisible(true);
		
	}
}
