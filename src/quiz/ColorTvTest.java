package quiz;

public class ColorTvTest {
	public static void main(String[] args) {
		ColorTv colorTv = new ColorTv(66, 2480);
		colorTv.showInfo();
		
		Iptv Iptv = new Iptv("192.168.0.8",66,3840);
		Iptv.showInfo();
	}
}
