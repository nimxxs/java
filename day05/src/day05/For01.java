package day05;

public class For01 {
	public static void main(String[] args) {
		// 1+2+3+...9+10=55
		// 문 (statement 제어문, 반복문)
		// 식 (계산)
		int sum = 0;
		for(int a=1; a<11; a++) {
			sum=sum+a;
			System.out.print(a);
			if(a<10) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		
	}
}
