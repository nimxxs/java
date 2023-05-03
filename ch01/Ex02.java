package ch01;

public class Ex02 { //클래스 선언, 클래스 이름 == 소스파일의 이름과 같아야 함.
	public static void main(String[] args) {
		// 변수
		// 데이터타입 이름; 선언
		// 이름 = 값;		대입(값의저장)
		int a;
		a = 10;
		//System.out.println(a);
		/* 변수의 초기화 : 변수의 최초의 값을 넣어주는 것.
		   변수는 선언 된 영역 안에서만 가능.
		   변수 이름 : 소문자, 어떤 것을 사용할지 유추 가능한 이름 사용.
		   			(ex. int age; String name;)
		   =	: 대입을 의미 (오른쪽에 있는 값을 왼쪽에 대입한다.)
		   변수를 사용한다는 건 변수 안에 있는 값을 사용한다는 것.
		   변수는 하나의 값만을 저장하는 저장소.
		   제일 마지막 대입값이 남는다.
		   변수의 갯수와 이름의 길이는 상관없이 선언 가능.
		*/
		a = 20;
		System.out.println(a);
		int b = 30; //선언과 대입 한 번에 가능.
		System.out.println(b);
		int c = b; //같은 타입끼리 대입 가능.
		System.out.println(c); //값의 복사, b가 사라지는 것이 아님.
		int d =
				c + a; //세미콜론이 있어야 하나의 실행문으로 인식.
		System.out.println(d);
	
	}//main 영역
}// class 영역	
	
