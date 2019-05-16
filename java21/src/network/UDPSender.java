package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// 네트워크 통신은 소켓이 있어야 한다.
		DatagramSocket socket = new DatagramSocket(); //UDP용 소켓
		// 소켓으로 패킷을 전송한다.
		String str = "I am a java programmer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet 
			= new DatagramPacket(data, data.length,ip,7000);  //데이터(배열), 데이터길이, ip , port
		
		socket.send(packet);
		socket.close();
	}

}
