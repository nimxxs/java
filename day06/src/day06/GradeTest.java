package day06;

public class GradeTest {
	public static void main(String[] args) {
		Grade myGrade = new Grade(90,86,75);
		double avg = myGrade.average(0);	
		// .average(소수점 개수);
		System.out.println(avg);
//		System.out.println(Math.round(avg));	
		// Math.round : 반올림

		
	}
}
