package ch02;

public class Ex09 {
	public static void main(String[] args) {
		// 대입 연산자
		// 변수의 값을 변경함
		// ( = , += , -= , *= , /= , %= )
		int a = 10;
		System.out.println(a+10);
		System.out.println(a);	
		// 단순한 +라서 변수의 값이 변하지 않음
		
		System.out.println(a+=10); // a = a+10 : a의 값은 20
		System.out.println(a);
		// 대입연산자와 함께 사용하여 변수의 값이 변함
		
		int x = 10;
		int y = ++x; // x의 값은 이미 11로 변함, 증감 먼저 대입 마지막
		System.out.println(x);
		System.out.println(y);
		
	}
}
