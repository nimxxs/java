package ch03;

public class SwitchEx05 {
	public static void main(String[] args) {
		
		char grade = '0';		// 'A'=65 'a'=97 '0'=48 -> 숫자0이 아닌 문자0
		switch(grade) {
			case 'A':								// A,a,0일 경우 (case) 하나만 해당되어도 실행
			case 'a':
			case '0':
				System.out.println("최고 등급입니다.");
			case 'B':								// B이거나 b인 경우 (case) 하나만 해당되어도 실행
			case 'b':
				System.out.println("중간 등급입니다.");
			break;									// switch문 빠져나감
			default:								// 값이 없을 경우 실행
				System.out.println("최저 등급입니다.");
		}
	}
}
