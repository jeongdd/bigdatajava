package stringTest;

public class PatternTest {

	public static void main(String[] args) {
		String data[] = {	"bat",
							"baby",
							"bonus",
							"cA",
							"ca",
							"co",
							"c",
							"c0",
							"car",
							"combat",
							"count",
							"date",
							"disc"
		};
		
		System.out.println(data.length);
		
		String s2 = "Hi, Hello!! call"; 
		String s3 = "Hi7, Hello!! call";
		
		
		String s4[] = s3.split("H[a-z][0-9]");  // H 이후 값을 출력
		for (String s : s4) {
			System.out.println(s);
		}
		
	}
	

}
