package day06;

public class Grade {
	// kor, eng, mat
	// 평균 출력하는 class
	// 따로 class를 만들어서 쓰는 이유 : 코드가 많아지면 하나하나 치기 힘들기 때문
	
	public double kor, eng, mat;
	public Grade() {
		
	}
	public Grade(double kor, double eng, double mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public double average(int digit) {
		// 1)
//		double num=1;
//		for(int i=0; i<digit; i++) {
//			num=num*10;
//		}
		// 2)
		double num = Math.pow(10, digit);
		
		double avg = Math.round((kor+eng+mat)/3*num);
		return avg/num;
	
	}	// 평균값 소수점이 1개, 2개, ~ 여러 개 보이고 싶을 경우
		// 1) 반복문 돌리거나 2) Math.pow 쓰거나
		
	
//	public void showInfo() {
//		System.out.println("나의 평균은 "++"입니다.");
	
	
	// void는 결과가 없는 것 = 타입을 안써도 됨
	// 함수의 결과가 있을 때 return이라고 함
	
	
}

