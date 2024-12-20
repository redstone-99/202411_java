package test.mypac;

public class AppleBox {
	//필드
	private Apple item;
	
	//사과를 포장하는 메소드
	public void pack(Apple item) {
		this.item=item;
	}
	
	//사과를 꺼내는 메소드
	public Apple unPack() {
		return item;
	}
	
//	AppleBox box1 = new AppleBox();
//	box1.pack(new Apple());
//	Apple apple = box1.unPack();
}
