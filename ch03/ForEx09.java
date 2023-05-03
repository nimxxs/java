package ch03;

public class ForEx09 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <-> 조건문 속 반복문
		for(int a=1; a<=10; a++) {
			// for문의 조건식이 true 일 때 실행
			if(a%2==0) {						// 나머지 연산 : a보다 큰 수를 나누게 되면 나눠지지 않음
				// if문의 조건식이 true 일 때 실행
				System.out.println(a+" : 짝수");
			}else {
				// if문의 조건식이 false 일 때 실행
				System.out.println(a+" : 홀수");
			} // if문 종료
		} // for문 종료
	}
}
