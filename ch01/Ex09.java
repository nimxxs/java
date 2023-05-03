package ch01;

public class Ex09 { // 타입 변환
	public static void main(String[] args) {
		// 작은 타입이 -> 큰 타입으로 변환(대입), 자동 변환됨 (프로모션, 업캐스팅)
		// 정수 < 실수
		char a = 'a';
		int b = (int)a;
		// 대입 하려는 타입 적어두기
		System.out.println(a);
		System.out.println(b);
		
		double c = (double)b;
		System.out.println(c);
		
		
	}
}
