package ch02;

public class Ex06 {
	public static void main(String[] args) {
		// 문자열 연산 ( + )
		// 더한다는 의미보단 연결한다는 의미
		String a = "JDK" + 6.0;
		System.out.println(a);
		String b = a+"특징";
		System.out.println(b);
		String c ="JDK"+3+3.0;
		System.out.println(c);
		String d = 3+3.0+"JDK"; // 전부 String을 사용했기 때문에 전부 문자열임
		System.out.println(d); // 산수 먼저 더하고 문자열
		
		int e = 100;		// 숫자 100
		String f = "100";	// 문자 100
		System.out.println(e+f); // int+String : String과 +하면 결과는 무조건 String 타입으로 나옴 그래서 결과가 100100
		
		// 혼자 연습해봄
		int x = 3 , y = 4;
		String z = "결과";
		System.out.println(x+y+z);
		System.out.println(z+x+y);
		
		
	}
}
