package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		// for문 속 for문
		int a;
		int b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5; b++) {
				System.out.println(a*b); // 꼭 초기식 -> 조건식(true) -> 실행코드 -> 증감식
			}
		}
		
		System.out.println("---------------");
		// 구구단
		// 단 : dan , 곱할 수 : num
		
//		int x;
//		int y;
//		for(x=1; x<=9; x++) {
//			for(y=1; y<=9; y++) {
//				System.out.println(x*y);
			
		int dan;
		int num;
		for(dan=2; dan<10; dan++) {		// 2단~9단
			for(num=1; num<10; num++) { // 곱할 수는 1~9까지
				System.out.println(dan+"단 : "+dan+"x"+num+"="+(dan*num)); // () : 수학에서 연산의 우선순위 가장 높음
		}
	}
}
}
