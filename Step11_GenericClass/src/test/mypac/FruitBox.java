package test.mypac;

// 클래스 정의시에 특정 type 은 전달받아서 사용하는 구조로 정의할수 있다.
// 그러한 클래스를 Generic 클래스라고 한다.
public class FruitBox<T> {	//포괄클래스(Generic 클래스) 타입이라는 의미에서 T
	private T item;
	
	public void pack(T item) {
		this.item=item;
	}
	
	public T unPack() {
		return item;
	}
}
