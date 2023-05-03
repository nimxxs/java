package test;

public class Test03 {
	public static void main(String[] args) {
		int a, b;
		for (a=1; a<=5; a++) {			// 5째줄까지의 반복
			for(b=1; b<=6-a; b++) {		// 별의 개수
				System.out.print("*");
			}
			System.out.println();		// 줄바꿈
		}
	}
}
