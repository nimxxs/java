package ch03;

public class DoWhileEx01 {
	public static void main(String[] args) {
		// Dowhile문 ? while문을 뒤집은 것
		// 무조건 한 번은 실행 -> 조건이 false여도 실행
		
		// while문
		int a = 0;
		while(a<3) {
			a++;
			System.out.println("hello");	
		}
		
		// Do-while문
		int b = 0;
		do {
			System.out.println("hihihi");
			b++;
		}while(b<3);
	}
}
