package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		// for( 초기식; 조건식; 증강식)  {
		//	  실행코드 
		// }
		// 실행순서: 초기식 -> 조건식(t) -> 실행코드 -> 증감식 /-> 조건식 -> 실행코드 -> 증감식 /-> 조건식 -> 실행코드 -> 조건식
		// 초기식 : 처음 단 한 번만 실행
		// 조건식 : 조건식의 결과가 true 일 때 실행문 실행, 몇 번 반복하는지 알 수 있음
		// 증감식 : 증강함. 대입연산자가 사용됨.
		// 조건식이 false 일 때 for문 종료
		
//		for(int a=1; a<=3; a++) {
//			System.out.println("안녕하세요");
//		}// for문 종료
		
		// 0~5까지 출력하는 코드
		for(int b=0; b<=5; b++) {
			System.out.println(b);
		}
		
		//1~100까지 출력하는 코드
		for(int c=1; c<=100; c++) {		// 증감식이 없어도 실행가능
			System.out.println(c);
		}
	}
}
