package ch03;

public class SwitchEx04 {
	public static void main(String[] args) {
		int a = 50;
		switch(a) {
			case 10:
				System.out.println("10점");
			default:
				System.out.println("0점");
			case 20:
				System.out.println("20점");
			break;							// switch문 끝남
			case 30:
				System.out.println("30점");
				
		}
	}
}
