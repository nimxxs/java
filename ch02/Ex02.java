package ch02;

public class Ex02 {
	public static void main(String[] args) {
		// 증감연산자 위치와 순서
		// 변수 앞 (선증가 1순위) / 변수 뒤 (후증가 마지막 순위)
		int a = 10;				// 주석으로 값을 쓰기
//		System.out.println(a++); // 출력 , 연산 10 11
//		System.out.println(++a); //	연산 , 출력 12 12
//		System.out.println(a++); // 출력 , 연산 12 13
//		System.out.println(a++); // 출력 , 연산 13 14
//		System.out.println(++a); // 연산 , 출력 15 15
//							a++; // 1증가			 16
//		System.out.println(++a); // 연산 , 출력 17 17
//		System.out.println(a);   // 17
		
		System.out.println(a--); // 출력 , 연산 10 9
		System.out.println(--a); // 연산 , 출력 8 8
		System.out.println(a--); // 출력 , 연산 8 7
		System.out.println(a--); // 출력 , 연산 7 6
		System.out.println(--a); // 연산 , 출력 5 5
							a--; // 1감소 		4
		System.out.println(--a); // 연산 , 출력 3 3
		System.out.println(a);	 // 3
		
		
	}
}
