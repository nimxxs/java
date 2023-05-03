package ch03;

public class WhileEx03 {
	public static void main(String[] args) {
		// 구구단
		int dan, num;
		for(dan=2; dan<10; dan++) {
			for(num=1; num<10; num++) {
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
		
		System.out.println("-----------------");
		
		// while 문으로 바꿔보기
		int a=2;
	//  int b=1; -> 초기식이 여기에 있으면 안됨
		while(a<10) {
			int b=1; // 초기식의 위치는 반드시 조건식 위에!
			while(b<10) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
		}
	}
}
