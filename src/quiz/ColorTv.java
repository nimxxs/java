package quiz;

public class ColorTv extends Tv{
	private int color;
	
	public int getColor() {
		return color;
	}
	public ColorTv(int size, int color) {
		super(size);
		this.color=color;
	}
	public void showInfo() {
		System.out.println(this.getSize()+"인치, "+color+"컬러");
	}
}
