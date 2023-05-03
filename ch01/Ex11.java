package ch01;

public class Ex11 {
	public static void main(String[] args) {
		int a = 130;
		byte b = (byte)a;	// 오버플로우 
		System.out.println(b); 
		// 표현할 수 있는 범위를 넘어서 나타나는 현상.
		
		// 형변환 '기준'이 있어서 오류가 남
		float f = (float)5.7; //(float) , f , F를 사용해 형태를 맞춰줌
		
		long c = 100000*100000L; // (long), l , L 
		System.out.println(c);
	}
}
