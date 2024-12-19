package test.mypac;

public class MyWeapon extends Weapon{

	@Override	//Weapon(부모) 미완성을 자식에서 강제로 
	public void attack() {
		System.out.println("지상 공격을 해요!");
	}
}
