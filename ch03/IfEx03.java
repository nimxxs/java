package ch03;

public class IfEx03 {
	public static void main(String[] args) {
		// if-else문
		int a = 6;
		if(a<0) {
			System.out.println("크다");
		}else { // 필수 아닌 선택, 단독 사용 불가
			//결과가 false일 때 나오게 하고 싶을 때 else를 사용
			System.out.println("작다");
		}
		
		System.out.println(a);
	}
}
