package day05;

public class Array02 { // 배열
	public static void main(String[] args) {
//		int nums[]= {1,3,5,7,9,100,30};		// 배열은 중요 / 배열 만들 땐 대괄호 사용 [] / 단점 : 개수를 세어야함
//											// 입력과 동시에 값을 넣을 땐 중괄호 사용 {} 
//		System.out.println(nums.length);	// 개수를 알 수 있음, length : 길이
//		int total = nums.length;			// 첫 번째는 항상 0
//		
//		// 방법 1
//		int sum=0;
//		for(int i=0; i<total; i++) {
//			sum+=nums[i];
//		}
//		System.out.println(sum);
//		System.out.println((double)sum/total);	// int는 정수이기 때문에 정수값으로 나옴 -> double로 형변환 해줘야함 
//
//		// 방법 2
//		// for-each : 각각의 반복문을 넣을 수 있다
//		int sum2=0;
//		for(int j:nums) {
//			sum2+=j;
//		}
//		System.out.println(sum2);
//		
//		String fruits[] = {"딸기","사과","복숭아","키위"};
//		for(String fruit : fruits) {
//			System.out.print(fruit+",");
//		}
//		
//		// 2차원 배열,
//		int intArray [][] = new int[2][3];
//		intArray[0][0]=1;
//		intArray[0][1]=2;
//		intArray[0][2]=3;
//		
//		intArray[0][0]=100;
//		intArray[1][1]=200;
//		intArray[1][2]=300;
//		
////		intArray[2][0]=500;
////		intArray[2][1]=700;
////		intArray[2][2]=900;
//		
//		for(int a=0; a<intArray.length; a++) {
//			for(int b=0; b<intArray[a].length; b++) {
//				System.out.println(intArray[a][b]+",");
//			}
//		}
////		System.out.println(intArray[2][2]);

		// 1)
		int nums[] = { 1, 3, 5, 7, 9, 10, 12, 19, 900, 40 }; // 개수 정해놓지 않고 쓰는 방법
		int total = nums.length;
		System.out.println(total); // {} 안에 숫자 개수

		String fruits[] = new String[5]; // new : 새로운 객체 하나를 메모리에 띄우겠다는 뜻 / 개수를 정해놓고 쓰는 방법
		fruits[0] = "포도"; // 숫자는 무조건 0부터 시작해야함 -> 약속임
		fruits[1] = "딸기";
		fruits[2] = "사과";
		fruits[3] = "오렌지";
		fruits[4] = "키위";

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// 배열을 쓰는 이유는 가독성 좋기 때문
		// 2)
		String fruit0 = "포도";
		String fruit1 = "딸기";
		String fruit2 = "사과";
		String fruit3 = "오렌지";
		String fruit4 = "키위";
		System.out.println(fruit0);
		System.out.println(fruit1);
		System.out.println(fruit2);
		System.out.println(fruit3);
		System.out.println(fruit4); // -> 출력문을 5개 다 써야함

		String animals[] = { "강아지", "고양이", "사자", "호랑이" }; // 시작은 무조건 0부터 / 현재 0,1,2,3
//		 	 System.out.println(animals[1]);					   -> 고양이만 출력
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

		for (String animal : animals) {
			System.out.println(animal); // for each문
		}

		// 3,5,6,7,8,14,37,64,87,90 에서 3의 배수(나머지 연산이 3 = 3의 배수이다)
		int num2[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 899899 }; // -> 개수를 세고싶지 않을 때 중괄호 사용하면 됨
		for (int x = 0; x < num2.length; x++) {
			if (num2[x] % 3 == 0) {
				System.out.println(num2[x] + " ");
			}
		}
		for (int num : num2) {
			if (num % 3 == 0) {
				System.out.print(num + " ");			// " "을 왜 넣지? -> print에 ln 빠져서
			}
		}

	}
}
