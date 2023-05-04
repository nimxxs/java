package day07;

public class ColorPoint extends Point {
	// extends : 상속을 받음
	// ColorPoint는 Point에게 상속을 받음
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color+" / ");
		showPoint();
		this.showPoint();
	}

}
