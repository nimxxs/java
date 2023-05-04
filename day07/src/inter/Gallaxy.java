package inter;

public class Gallaxy implements MobilePhoneInterface, Mp3Interface {

	public void sendCall() {
		System.out.println("띵띠링띠 띠띠링");
	}
	public void receiveCall() {
		System.out.println("전화왔어요...");
	}
	public void samsungPay() {
		System.out.println("삼성페이 결제할 수 있음");
	}
	public void sendSMS() {
		System.out.println("sms 보낼 수 있음");
	}
	public void sendSms() {
		System.out.println("sms 받을 수 있음");
	}
	public void stop() {
		System.out.println("music stop");
	}
	public void play() {
		System.out.println("music start");
		
	}

}
