package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSToIp {

	public static void main(String[] args)  { //throws UnknownHostException - 도메인이 맞지 않으면 에러처리
		String dns = "www.naver.com";
		InetAddress address;
		try {
			address = InetAddress.getByName(dns);
			System.out.println(address);
			System.out.println("IP주소 : " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("도메인 네임이 존재하지 않습니다.");
			System.out.println("올바른 도메인 네임을 입력해주세요.");
		}
	}

}
