package ch03;

public class IfEx10 {
	public static void main(String[] args) {
		int score = 80;
	//	String result; 선언만 하면 안됨
		String result="";				// (="") 가 없으면 실행이 안됨 -> if문이 false일 때 출력되는 결과값이 없기 때문에 
		if(score>=90) {					// 그래서 result에 초기값을 넣어주는 것임
			if(score>=95) {
				result="A+";
			}else {
				result="A";
			}
		}
		System.out.println(result);
	}
	// result 오류나는 이유 :
	// if문이 false일 때의 값이 없기 때문에 result의 초기화가 필요
}	// String에서는 " " 공백도 문자임

