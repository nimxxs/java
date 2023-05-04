package quiz;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src);	// 바꿔주기
	abstract public String srcString();
	abstract public String destString();
	
	protected double ratio;						// protect 같은 패키지 안에서는 사용 가능 다른 패키지 안에서 사용 불가
	public void converting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꾸어 줍니다.");
		System.out.println(srcString()+"을 입력하세요.");
		double inputValue = scanner.nextDouble();
		double result = convert (inputValue);
		System.out.println("변환결과 : "+result+destString()+"입니다.");
	}
}
