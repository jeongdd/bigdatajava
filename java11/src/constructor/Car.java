package constructor;

import javax.print.DocFlavor.STRING;

public class Car {

		// 정적속성 
		String color;			// 전역변수
		boolean convertible;	// 전역변수
		
		// 파라메터 없는 경우 => 기본 생성자
		public Car() {
		}
		
		public Car(String color) {
			this.color = color;
		}

		public Car(String color, boolean convertible) {
			this.color = color;
			this.convertible = convertible;
		}
		

		// 동적속성
		public void change() {
			System.out.println("기어를 바꾸다.");
		}
		
		public int speedUp(int nowSpeed) {
			return nowSpeed + 30;
		}

		@Override
		public String toString() {
			return "Car [color=" + color + ", convertible=" + convertible + "]";
		}


}
