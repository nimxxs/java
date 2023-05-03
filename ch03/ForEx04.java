package ch03;

public class ForEx04 {
	public static void main(String[] args) {
		int sum =0;
		sum = sum +1;	// sum+=1
		sum = sum +2;	
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println("0~5까지의 합 : "+sum);
		
		System.out.println("-----------------");
		
		// 0~5까지의 합
		int sum1=0; 								// 초기값을 주어야 하는 것과 안해도 되는 것을 구분 잘하기
		for (int i=1; i<=5; i++) {
			sum1+=i;
		}
		System.out.println("0~5까지의 합 : "+sum1);
		
		// 1~5까지의 합
		int sum2=1;
		int a;
		for (a=2; a<=5; a++) {
			sum2+=a;
		}
		System.out.println("0~5까지의 합 : "+sum2);
		
		// 1~100까지의 합
		int sum3 = 0;
		int b;
		for (b=1; b<101; b++) {
			sum3+=b;
		}
		System.out.println("1~100까지의 합 : "+sum3);
	}
}
