package ch03;

public class SwitchEx07 {
	public static void main(String[] args) {
//		int score = 0;						// =0; 지워도됨(대입되는거랑 안해도 되는 것 구분 잘하기) // 변수의 최초 값을 넣는 것 : 초기화값
//		String grade = "B";					
//		switch(grade) {						// () 안에 들어가는 값을 사용 해야함
//			case"A":
//				score=100;
//			case"B":
//				score=80;
//				break;						// break가 없으면 "B"를 넣었을 때 score는 60이 나옴
//			default:						// 왜냐?
//				score=60;					// 변수는 대입을 여러 번 해도 마지막 값만 나옴 (하나의 값만 나옴)
//		}
//		System.out.println("score 는 : "+score);
		
		int score=85;						
		String grade;
		switch(score) {						
			case 100:
				grade="A";
			case 80:
				grade="B";
			default:
				grade="C";
			case 60:
				grade="D";
		}
		System.out.println("grade 는 : "+grade);
	}
}
