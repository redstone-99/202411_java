package test.mypac;

public class MelonBox {
	//필드
	private Melon item;
	
	//사과를 포장하는 메소드
	public void pack(Melon item) {
		this.item=item;
	}
	
	//사과를 꺼내는 메소드
	public Melon unPack() {
		return item;
	}
	
//	AppleBox box1 = new AppleBox();
//	box1.pack(new Apple());
//	Apple apple = box1.unPack();
}
