package ch03;

public class ForEx10 {
	public static void main(String[] args) {
		// break문 사용
		for(int a=1; a<=100; a++) {
			if(a%5==0) {
				break;	// 5에서 빠져나옴
			}
			System.out.println(a);
		}
		System.out.println("hello");
	}
}
