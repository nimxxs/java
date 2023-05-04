package day06;

public class Circle {
	int radius;
	String name;
	
	// 생성자 2개나 만들어짐 : 오버로드 (과적하다)
	public Circle(){							// 생성자는 항상 public으로 정의
		// System.out.println("나는 circle");		
	}
	public Circle(int r) {	
		// System.out.println("나는 circle");
		radius = r;
	}
	public Circle(int r, String n) {			
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
