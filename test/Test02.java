package test;

public class Test02 {
	public static void main(String[] args) {
		int a, b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=a; b++) {		// b가 a보다 작거나 같을 때까지 반복
				System.out.print("*");	// ln : 줄 바꿈이기에 ln을 빼야함
			}
			System.out.println();		// b가 끝나고 줄바꿈을 위한 출력문
		}
	}
}
