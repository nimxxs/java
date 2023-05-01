package day05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		// 50000, 10000, 5000, 1000, 500, 100, 50, 10 : 규칙성이 보이지 않기 때문에 배열을 사용 (for문 같은 거 사용 못함)
		
		System.out.println("얼마를 바꿀건가요? 금액을 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);		// System.in : 키보드로부터 입력 받을 수 있다는 뜻
		int money = scanner.nextInt();					// nextInt : int값을 입력받겠다는 뜻
		
		System.out.println("오만원 : "+money/50000+"장");
		money = money % 50000;
//		System.out.println(money);
		System.out.println("만원 : "+money/10000+"장");
		money = money % 10000;
		System.out.println("오천원 : "+money/5000+"장");
		money = money % 5000;
		System.out.println("천원 : "+money/1000+"장");
		money = money % 1000;
		System.out.println("오백원 : "+money/500+"장");
		money = money % 500;
		System.out.println("백원 : "+money/100+"장");
		money = money % 100;
		System.out.println("오십 : "+money/50+"장");
		money = money % 50;
		System.out.println("십원 : "+money/10+"장");
		money = money % 10;
		
		scanner.close();								// 안닫아줘도 에러는 안남
		
	}
}
