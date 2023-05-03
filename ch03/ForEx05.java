package ch03;

public class ForEx05 {
	public static void main(String[] args) {
		// 100까지 홀수의 합
		int sum=0;
		int a;
		for(a=1; a<101; a+=2) {
			sum+=a;
		}
		System.out.println(sum);
		
		// 100까지 짝수의 합
		int sum2=0;
		int b;
		for(b=2; b<101; b+=2) {
			sum2+=b;
		}
		System.out.println(sum2);
	}
}
