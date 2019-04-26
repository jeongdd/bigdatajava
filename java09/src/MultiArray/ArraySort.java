package MultiArray;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int num[] = {99, 89, 56, 12, 44, 66, 88, 76};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		
	}

}
