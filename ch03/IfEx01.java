package ch03;

public class IfEx01 {
	public static void main(String[] args) {
		// if문
		// 조건식의 결과가 true일 때 실행 부분이 실행됨
		// false 일 때는 필수가 아님
		
		int a = 6;
		if(a>0) {
			// 조건식의 결과가 true 일 때 실행됨
			System.out.println("크다");
			System.out.println("크다");
			System.out.println("크다");
			
		}
		
		if(a>0) {
			a+=4;
			
		}
		System.out.println(a);
		
		if(a<0) {
			a+=4;
			System.out.println(a);
		}
		System.out.println(a);
	}
}
