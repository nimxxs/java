package ch02;

public class Ex05 {
	public static void main(String[] args) {
		// 비교연산자
		// (==, >, <, >=, <=, !) !: 반대를 의미
		// 비교연산자의 결과는 논리형으로 나옴
		System.out.println(10>0);
		System.out.println(10==0);
		System.out.println(10==0+10);
		System.out.println(10!=0); // 10과 0은 같지 않다
		
		// 변수 활용
		int a = 10, b = 0;
		System.out.println(a>=b);
		System.out.println(a==b+10);
		System.out.println(a!=b);
		
	}
}
