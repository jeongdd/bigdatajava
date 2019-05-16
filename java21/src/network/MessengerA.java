package network;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame{
	
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public MessengerA() throws Exception {
		socket = new DatagramSocket(5000);
		list = new JTextArea(6,20);
		list.setBackground(Color.PINK);
		list.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 30));
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = input.getText();
				list.append("정다솔 >> " + str + "\n");
				input.setText("");
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.0.145");
					
					DatagramPacket packet 
					= new DatagramPacket(data, data.length,ip,6000);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 				
			}
		});
		input.setBackground(Color.ORANGE);
		input.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 20));
		setTitle("메신저 A 채팅화면");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램이 자동으로 닫힘
		
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		// 패킷 받는 코드(무한루프)
		while(true) {
			
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("박지하 >> " + new String (data) + "\n");
			
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		MessengerA A = new MessengerA();
		A.process(); // 보내기 전에 받는 코드가 먼저 돌아가야함
	}

}























































