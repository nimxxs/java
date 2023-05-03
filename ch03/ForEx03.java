package ch03;

public class ForEx03 {
	public static void main(String[] args) {
		// 1~100까지 홀수만 출력하는 코드
		// 힌트 : 증감식에 대입연산자 사용!
		
		for(int a=1; a<101; a+=2 ) {		// 생각보다 존나 단순하군 1+2=3+2...
			System.out.println(a);
		}
		
		for(int a=2; a<101; a+=2 ) {		
			System.out.println(a);
		}
	}
}
