package ch02;

public class Ex08 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 조건식의 결과가 true일 때의 값 또는 연산식 : 조건식의 결과가 false;
		// 조건식 - 결과가 논리형으로 나오도록 구성
		System.out.println(10>0 ? 100 : -100);
		System.out.println(10<0 ? 'A' : "F");
		System.out.println(10>0 ? 10+10 : 10-10);
		
		int a = 10;
		System.out.println(a>0 ? "크다":"작다");
		String result = a>0 ? "크다" : "작다" ;
		System.out.println(result);
		
		boolean result2 = a>5? false : false;
		System.out.println(result2);
		// 결과를 보려는 변수를 사용할 때 -> 변수의 타입에 맞는 결과값을 구성
		// 내용은 중요하지 않음, 변수의 타입을 맞춰줘야함
		
		int age = 85;
		String result3 = (!(age>90))?"가":"나";
		System.out.println(result3);
		
		int score = 85;
		char grade = (score>90) ?  'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score+"점은 "+grade+"등급입니다");
		
		
		
	
	}
}
