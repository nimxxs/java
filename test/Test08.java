package test;

public class Test08 {
	public static void main(String[] args) {
		int a, b;		
//		for(a=0; a<5; a++) {
//			for(b=1; b<5-a; b++) {
//				System.out.print(" ");
//			}
//			for(b=0; b<a*2+1; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(a=1; a<=5; a++) {
			for(b=1; b<6-a; b++) {
				System.out.print(" ");
		}
			for(b=0; b<a*2-1; b++) {
				System.out.print("*");
		}
		System.out.println();
		
		}
	}
}
