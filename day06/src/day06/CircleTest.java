package day06;

public class CircleTest {
	public static void main(String[] args) {
		
		/*
		함수란?
		f(x,y)=x*2+y+y;		x,y = 매개변수라고 함
		리모콘(11)=mbc
		리모콘(33)=ocn
		*/
											// new 라는 생성자 함수를 사용
		Circle circle = new Circle();		// 'Circle.java'에 Circle이란 객체를 만든 걸 사용하는 거임
		circle.name="써클";
		circle.radius=10;					// 이름은 써클이고 반지름이 10인 객체를 만듦
		System.out.println(circle.name+"의 넓이는 "+circle.getArea()+"입니다.");
		
		Circle circle02 = new Circle(17);
		circle.name = "써클02";
		System.out.println(circle02.name+"의 넓이는 "+circle02.getArea()+"입니다.");
		
		Circle pizza = new Circle();
		pizza.name = "도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다.");
		
		// 던킨도너츠
		Circle donut = new Circle();
		donut.name = "던킨도너츠";
		donut.radius = 8;
		System.out.println(donut.name+"의 넓이는 "+donut.getArea()+"입니다.");
		
		// 여러 문장 쓰기 싫을 때
		Circle gong = new Circle(30,"축구공");
		System.out.println(gong.name+"의 넓이는 "+gong.getArea()+"입니다.");
	}
}
