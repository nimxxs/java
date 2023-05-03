package test;

public class Test09 {
	public static void main(String[] args) {
		int a, b;
		for(a=5; a>0; a--) {
			for(b=5-a; b>0; b--) {
				System.out.print(" ");
			}
			for(b=a*2-1; b>0; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
