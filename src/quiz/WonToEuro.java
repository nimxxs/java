package quiz;

public class WonToEuro extends Converter {
	
	public WonToEuro(double ratio) {
		this.ratio=ratio;
	}
	public double convert(double src) {
		return src/ratio;
	}
	public String srcString() {
		return "원";
	}
	public String destString() {
		return "유로";
	}

}
