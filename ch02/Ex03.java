package ch02;

public class Ex03 {
	public static void main(String[] args) {
		// 산술연산자 ( +, -, *, /, % )
		int a = 10;
		double b = 5.5;
		System.out.println(a+b);
		
		// 변수를 활용하는 코드가 더 좋은 코드임
		int c = (int)(a+b);
		System.out.println(c); // 0.5 손실됨
		
		double d = (double)(a+b);
		System.out.println(d);
		/*
		 	나머지연산 : 나누고 난 후 남는 값
		 	10 % 2 = 0		: 남는 값 없음
		 	10 % 3 = 1
		 	10 % 4 = 2
		 	10 % 20 = 10	: 나눌 수가 없기에 10은 나눠지지 않고 남음
		 */
		
		int e = 10;
		System.out.println(e%2 == 0);
		System.out.println(e%3 == 1); 
	
		
	}
}
