package ch02;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// 출력, 증감연산자, 덧셈
		// 순서 : 증감 -> 덧셈 -> 출력
//		System.out.println(++a + b);	// 11+10
//		System.out.println(++a + ++b); // 11+11
		
		// 후증가이기 때문에 가운데 덧셈이 먼저 일어남
//		System.out.println(a++ + b++); // 10+10
		
		// 증감 , 덧셈 , 출력 순으로 일어남
//		System.out.println(++a + ++a); // 11+12
		
		// 앞에 있는 증가 연산이 먼저 실행
		// 하나의 변수에는 연산자 하나만 대기할 수 있음
//		System.out.println(a++ + a++); // 10+11
		
		
		// 후증가인 경우 순서 : 덧셈 -> 출력 -> 증감 이기때문에 증감은 남아있는 상태
		// 그래서 (a++ + a++) 인 경우 10과 후증가한 11이 만나 21이 됨 -> 이후에 a 값을 출력하면 후증가가 발생하여 a의 값은 12가 됨
	}
}
