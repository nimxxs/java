package day07;

class Weapon {
	int fire() {
		return 1;
	}

//	int fire(int damage) {				// 메소드 오버라이딩 : 메소드의 이름, 매개변수 타입과 개수, 리턴 타입이 모두 동일하여야 성립
//		return damage;
//	}
class Canon extends Weapon {
	@Override							
	int fire() {
		return 10;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("Weapon의 데미지는 "+weaponDamage);
		
		// 동적 바인딩 : 실행 시간에 오버라이딩된 메소드 찾아 호출
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는 "+weaponDamage);
	}
}
}
