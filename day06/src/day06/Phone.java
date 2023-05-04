package day06;

public class Phone {
	public String phone;
	public int year;
	public String color;
	
	public Phone(String phone, int year, String color) {
		this.phone = phone;
		this.year = year;
		this.color = color;
	}
	public void showInfo() {
		System.out.println("나의 휴대폰은 "+phone+"이고 "+year+
										"년에 샀다. 색상은 "+color+"이다.");
	}
	
}
