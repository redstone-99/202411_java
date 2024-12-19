package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		
		Weapon w1 = new Weapon() {						//{}안에 클래스 class ? extends Weapon{} 
														//new Weapon() 가로 열고 닫고 Weapon 생성자 호출
			@Override
			//클래스 안 만들고 참조값 만들기
			public void attack() {
				System.out.println("몰라 아무데나 공격~");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			//추상클래스 타입 이렇게 쉽게 가능 ~ 익명의 로컬 이너 클래스를 이용해서 추상클래스 원하는 결과 값 얻어내기
			@Override
			public void attack() {
				System.out.println("장희주를 공격하자~");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
