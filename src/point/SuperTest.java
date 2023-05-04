package point;

// inner class : 따로 파일 안만들고 여기 안에서만 쓸 수 있는 클래스
class Point {
	private int x,y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int x, int y) {	// 생성자 2개 만들어짐 : 오버로드(여러개 만들어진 걸 뜻함)
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		this.showPoint();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		ColorPoint colorPoint = new ColorPoint(10,10,"red");
		colorPoint.showColorPoint();
	}
}
