package test.mypac;

public class YourWeapon extends Weapon{
	@Override	//Weapon(부모) 미완성을 자식에서 강제로 
	public void attack() {
		System.out.println("테스트으");
	}
}
