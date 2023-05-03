package ch03;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		int time = 8;
		switch(time) {	// 해당 케이스부터 밑에 있는 모든 실행문을 실행함
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다."); // 값이 없을 때 default로 옴 -> default 밑 모든 실행문이 실행됨
													// 정해진 위치 없지만 보통 맨 아래 사용
		}
	}
}
