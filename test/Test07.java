package test;

public class Test07 {
	public static void main(String[] args) {
		int a, b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=a-1; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=6-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
