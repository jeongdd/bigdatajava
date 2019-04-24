package 배열;

public class Example3 {

	public static void main(String[] args) {
		int su[] = new int[5];
		
		for (int i = 0; i < su.length; i++) {
						
//			if(su[i]==su[i]) {
				su[i] = i+1;
//			}
//			System.out.print(su[i]);
		}
		for (int i : su) {
			System.out.print(i);
		}
	}

}
