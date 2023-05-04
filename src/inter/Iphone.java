package inter;

public class Iphone implements MobilePhoneInterface {

	public void sendCall() {
		System.out.println("아이폰 신호음이 울립니다.");
	}
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	public void sendSMS() {
		System.out.println("sms 보낼 수 있음");
	}




}
