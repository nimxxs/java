package quiz;

public class Iptv extends ColorTv{
	private String ip;
	
	public Iptv(String ip, int size, int color) {
		super(size, color);		// super는 무조건 첫 줄에 !
		this.ip=ip;
		
	}
	public void showInfo() {
		System.out.print("IP 주소는 "+ip+"이고, ");
		super.showInfo();
	}
}
