package ch01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리형 boolean
		// 결과값이 t/f로만 나옴
		
		boolean a;
		a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		
		b = true;
		System.out.println(b);
		
		System.out.println(b);
		
		int x = 10;
		int y = 5;
		boolean z = x>y;
		System.out.println(z);
		
		z = (x != y); // ! : 프로그래밍 언어에서 반대의 의미, == : 같다는 의미 
		System.out.println("z의 결과는 : "+z);
	}
}
