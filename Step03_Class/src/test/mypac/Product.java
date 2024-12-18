package test.mypac;

//java 에서는 공개된 필드를 잘 사용하지 않는다.
//상품 하나의 정보를 담을 객체를 생성할 클래스 정의하기
public class Product {
	//외부에서 필드를 직접 참조 하지 못하도록 접근 지정자를 private 로 설정
	//Product 객체 내부에서만 참조 가능
	private int id;
	private String name;
	private int price;
	
	//디폴트 생성자
	public Product() {
		
	}
	
	//필드에 저장할 값을 모두 전달 받는 생성자
	public Product(int id, String name, int price) {
		//매개 변수에 전달된 값을 필드에 저장하기
        this.id = id;
        this.name = name;
        this.price = price;
    }
	//setter 메소드
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//getter 메소드
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
