package ch03;

public class WhileEx01 {		// 반복문
	public static void main(String[] args) {
		// While문 : for문을 세로로 세워놨다고 생각하면 됨
		// for문 <-> While문 바꿔보는 연습!
		// while문 속 while문 잘 쓰이지 않음.
		
		int a = 0;						//초기식
		while(a<3) {					// 조건식
			System.out.println("hello");
			a++;						// 증감식
		}// while문 종료
		
		System.out.println("---------------");
		
		int b = 0;
		while(b<3) {
			b++;						// 증감식의 위치는 실행문의 위 아래 상관없음
			System.out.println("hihihi");
		}
	}
}
