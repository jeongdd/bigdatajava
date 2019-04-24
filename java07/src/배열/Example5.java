package 배열;

public class Example5 {

	public static void main(String[] args) {
		
		int su[] = {66, 77, 88, 99};
		int max = su[0]; 
		
		for (int i = 0; i < su.length; i++) {
			if(su[i] > max) {
				max = su[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		
	}

}
