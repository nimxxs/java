package ch02;

public class Ex01 { // 연산자
	public static void main(String[] args) {
		// 증감연산자 ( ++ , -- )
		// 1증가, 1감소 (boolean 타입 사용 불가)
		/*int b = 10;
		System.out.println(b); // 10
						  ++b; // 하나의 실행문 : 혼자 있을때 증가한다 11
		System.out.println(b); // 11
						  b++; // 마찬가지					   	 12
		System.out.println(b); // 12*/
		
		int a = 10;
		// 할 일이 2가지 : 연산 , 출력
		// 증감연산자가 변수 뒤에 있을 때 연산이 제일 마지막에 일어남
		System.out.println(++a);	// 연산 , 출력 11 11 -> 선증가
		System.out.println(a);		//		 출력		11
		System.out.println(a++);	// 출력 , 연산 11 12 -> 후증가
		System.out.println(a);		// 		 출력		12

	}
}
