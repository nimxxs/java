package quiz;

public class WonToYuan extends Converter{
	
	public WonToYuan(double ratio) {
		this.ratio=ratio;
	}
	public double convert(double src) {
		return src/ratio.average(2);
	}
	public String srcString() {
		return "원";
	}
	public String destString() {
		return "위안";
	}
	

}
