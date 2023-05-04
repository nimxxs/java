package day06;

public class Book {
	// 제목, 작자
	public String title;			// 외부적 노출 : public, 내부적 : private
	public String author;
	
	// 생성자 함수
	//	특징 : class랑 이름이 같아야 함
	//  new라는 함수에 한 번만 호출 가능
	//  빈 생성자 함수 하나라도 만들어야 함, 아무것도 없으면 안됨
	public Book() {					// 생성자는 private으로 만들지 못함 왜? 생성을 못함
		this("untitled","nonamed");	// 공백 대신 this 사용 가능
	}
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}	// 나 자신을 가르키는 함수 : this
	
	public void showInfo() {
		System.out.println("제목 : "+title+", 작가는 "+author);
	}
}
