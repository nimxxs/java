package ch03;

public class SwitchEx06 {
	public static void main(String[] args) {
		
		int score = 96;
		switch(score/10) {					// 결과값이 int or string 타입으로만 나옴 -> int값으로 나오기에 9로 출력됨
			case 10: case 9:				// 굳이 줄 안바꾸고 한 줄로도 사용 가능
				System.out.println("A");
			case 8: case 7:
				System.out.println("B");
			break;
			default:
				System.out.println("F");
		}
	}
}
