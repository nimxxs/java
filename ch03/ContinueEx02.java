package ch03;

public class ContinueEx02 {
	public static void main(String[] args) {
		// 짝수만 출력
		for(int a=1; a<=10; a++) {
			if(a%2 != 0) {				// 홀수
				continue;				// 홀수 출력 안함
			}
			System.out.print(a+" ");	// println에서 ln은 줄바꿈을 뜻함
		}
		
		
		// 홀수만 출력
		
	}
}
