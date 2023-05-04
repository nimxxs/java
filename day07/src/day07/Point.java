package day07;

public class Point {
	// 속성 (properties)
	private int x;
	private int y;
	// private을 사용하면 자식에게 물려줄 수 없음
	
//	public int x;
//	public int y;
	// public을 사용하면 자식에게 물려줄 수 있음
	
	// getter (값을 얻어갈 수만 있는, 읽기전용) / setter
	
	// 행위(메서드)를 통해서 내부의 속성을 바꾸는 게 좋음
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," +y + ")");
	}
}
