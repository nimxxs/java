package day05;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		// 배열을 사용하는 이유는 규칙성이 없는 것에 순서를 매겨서 반복문을 사용 가능하게 하는 것
		// 배열은 규칙이 없는 것에 규칙을 만들어 줄 때 사용함
		
		int units [] = {50000, 10000, 5000, 1000, 500, 100, 50};	// 선언을 함으로써 for문 사용 가능
		int money = 186862349;
		
		for(int i=0; i<units.length; i++) {
		//	System.out.println(units[i]);
			System.out.println(units[i]+"원 : "+ money /units[i]+"장");
			money = money % units[i];								// 5만원 나누고 남은 돈 = money의 값이 바뀜
		}
	}
}
