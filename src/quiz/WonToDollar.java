package quiz;

public class WonToDollar extends Converter{
	
	public WonToDollar(double ratio) {
		this.ratio = ratio;
	}
	public double convert(double src) {
		return src/ratio;
	}
	public String srcString() {
		return "원";
	}
	public String destString() {
		return "달러";
	}

}
