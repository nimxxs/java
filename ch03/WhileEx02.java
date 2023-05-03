package ch03;

public class WhileEx02 {
	public static void main(String[] args) {
		// while문에서 break 사용
		int a=0;
		while(true) {
			a++;
			System.out.println("안녕");
			if(a==10) {
				break; // if문과 break 사용해서 while문 빠져나감
			}
		}
	}
}
