package ch03;

public class ForEx06 { // 무한 반복 주의
	public static void main(String[] args) {
		for(int a=1; a<=7; a--) {	// 증감식 없어도 가능하지만 무한 루프에 빠지게 됨.
			System.out.println("helloo world");
		}
	}
}
