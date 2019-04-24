package 배열;

public class Example6 {

	public static void main(String[] args) {
		int su[] = {66, 77, 88, 99};
		
		int su1 = su[0];
		su[0] = su[3];
		su[3] = su1;
		
		for (int i : su) {
			System.out.println(i);
		}
			
	}

}
