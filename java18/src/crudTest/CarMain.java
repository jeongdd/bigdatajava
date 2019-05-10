package crudTest;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CarMain {
	private JTextField IdT;
	private JTextField NameT;
	private JTextField ConT;
	private JTextField PriceT;

	public CarMain() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 25));
		f.setSize(291,334);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("ID");
		l1.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		f.getContentPane().add(l1);
		
		IdT = new JTextField();
		IdT.setFont(new Font("굴림", Font.PLAIN, 24));
		f.getContentPane().add(IdT);
		IdT.setColumns(10);
		
		JLabel l2 = new JLabel("NAME");
		l2.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		f.getContentPane().add(l2);
		
		NameT = new JTextField();
		NameT.setFont(new Font("굴림", Font.PLAIN, 23));
		NameT.setColumns(10);
		f.getContentPane().add(NameT);
		
		JLabel l3 = new JLabel("CONTENT");
		l3.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		f.getContentPane().add(l3);
		
		ConT = new JTextField();
		ConT.setFont(new Font("굴림", Font.PLAIN, 20));
		ConT.setColumns(10);
		f.getContentPane().add(ConT);
		
		JLabel l4 = new JLabel("PRICE");
		l4.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		f.getContentPane().add(l4);
		
		PriceT = new JTextField();
		PriceT.setFont(new Font("굴림", Font.PLAIN, 23));
		PriceT.setColumns(10);
		f.getContentPane().add(PriceT);
		
		JButton SearchB = new JButton("검색");
		SearchB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDAO dao = new CarDAO();
				try {
					dao.selectAll();
					ArrayList list = dao.selectAll();
					
					for (int i = 0; i < list.size(); i++) {
						System.out.println("<" + (i + 1) + ">");
						CarDTO dto = (CarDTO)list.get(i);
						System.out.println(dto.getId());
						System.out.println(dto.getName());
						System.out.println(dto.getContent());
						System.out.println(dto.getPrice());
						System.out.println("-----------------");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		SearchB.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(SearchB);
		
		JButton InsertB = new JButton("등록");
		InsertB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDAO dao = new CarDAO();
				CarDTO dto = new CarDTO();
				
				String id = IdT.getText();
				String name = NameT.getText();
				String content = ConT.getText();
				int price = Integer.parseInt(PriceT.getText());
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				try {
					dao.insert(dto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "등록완료");
						
						
			}
		});
		InsertB.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(InsertB);
		
		JButton UpdateB = new JButton("수정");
		UpdateB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDAO dao = new CarDAO();
				CarDTO dto = new CarDTO();
				
				int price = Integer.parseInt(PriceT.getText());
				String id = IdT.getText();
				
				dto.setPrice(price);
				dto.setId(id);
				
				try {
					dao.update(dto);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "수정완료");
			}
		});
		UpdateB.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(UpdateB);
		
		JButton DeleteB = new JButton("삭제");
		DeleteB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDAO dao = new CarDAO();
				CarDTO dto = new CarDTO();
				
				String name	= NameT.getText();
				
				dto.setName(name);
			
				try {
					dao.delete(dto);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "삭제완료");
			}
		});
		DeleteB.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		f.getContentPane().add(DeleteB);
		
		
		
		f.setVisible(true);
		
	}
}







