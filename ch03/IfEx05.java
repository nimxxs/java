package ch03;

public class IfEx05 {
	public static void main(String[] args) {
		//if else if else문
		int a = 6;
		if(a>100) {
			System.out.println("if true");
		}else if(a>50) {							//else if는 여러 개 사용 가능
			System.out.println("else if true");
		}else if(a>20) {
			System.out.println("else if2 true");
		}else if(a>0) {
			System.out.println("else if3 true");
		}else {										//else 는 필수가 아닌 선택, 문법상 가장 마지막에 위치해야함
			System.out.println("else true");
		}
	}
}
