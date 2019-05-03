package dto;

import javax.swing.JOptionPane;

import dto.InsertProcessing;



public class SearchProcessing {

	public static void main(String arg[]) throws Exception {
		
		MemberDTO dto = new MemberDTO();
		SelectProcessing db = new SelectProcessing();
		String id = JOptionPane.showInputDialog("ID 입력 : ");
		dto.setId(id);
		//select * from member where id = ?
		String[] mem =  db.select(dto);
		for (String s : mem) {
			JOptionPane.showMessageDialog(null, s);
		}
		
	}

}
