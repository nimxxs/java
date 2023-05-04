package day07;

public class Person {
	private int weight;				// private이라 weight 값 지정 불가?
	int age;
	public String name;
	protected int height;
	
	// Source 에 들어가서 Generate Getters and Setters 들어가서 클릭해서 만듦
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	public void setWeight(int weight) {		//private에 있는 weight 값 들고 오기
//		this.weight = weight;
//	}
//	
//	public int getWeight() {		// void가 아니라 return 타입이 있음
//		return weight;
//	}
	
	
	
}
