package instance;

class Person{}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}
class StudentWorker extends Student {}


// 생성자 오버로드 : 매개변수만 다르게 하여 여러 개 생성
// 매서드 오버로드
// 매서드 오버라이드 : 덮어쓰기

public class InstanceTest {
	
	static void print(Person person) {
		if(person instanceof Person) System.out.println("Person입니다.");
		if(person instanceof Student) System.out.println("Student입니다.");
		if(person instanceof Researcher) System.out.println("Researcher입니다.");
		if(person instanceof Professor) System.out.println("Professor입니다.");
		if(person instanceof StudentWorker) System.out.println("StudentWorker입니다.");
	}
	
	public static void main(String[] args) {
		print(new StudentWorker());
	}
}
