package day06;

public class BookTest {
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "쌩땍쥐베리");
		//System.out.println(littlePrince.author);
		//System.out.println(littlePrince.title);
		littlePrince.showInfo();
		
		Book java = new Book("java 코딩");
		//System.out.println(java.author);
		//System.out.println(java.title);
		java.showInfo();
		
		Book untitle = new Book();
		untitle.showInfo();
		
		Book myBook = littlePrince;
		littlePrince.author = "san theckjjiberry";
		System.out.println(myBook.author);
		// san theckjjiberry 만 출력됨
		// 안에 내용 전체가 바뀐다 생각하면 될듯
		// 복사가 아닌 참조, 주소만 바라보며 바뀐다?
		// 만약 myBookk.author="장성호";
		// System.out.println(myBookk.author); -> 장성호만 출력
		
		
		// 기본 타입이 아닌 변수들은 복사가 아닌 참조를 함
		int arr01[] = {1,2,3};
		int arr02[] = arr01;		// 복사가 되는 게 아니라 주소값만 넣어지는 것
		arr02[1] = 200;
		System.out.println(arr01[1]);
		
		
	}
}
