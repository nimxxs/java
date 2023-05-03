package ch03;

public class SwitchEx03 {
	public static void main(String[] args) {
		
		int a = 9;
		switch(a) {
			case 10 :
				System.out.println("10점");
			break;		// break;를 만나면 switch문을 빠져나감
						// 조건문 반복문 : if문, for문, while문, do-while문
						// case 종료가 됨
			case 9 :
				System.out.println("9점");
			break;
			case 8 :
				System.out.println("8점");
			
			default :
				System.out.println("0점");
		}
	}
}
