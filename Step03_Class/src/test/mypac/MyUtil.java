package test.mypac;

public class MyUtil {
	//data type 앞에 static 예약어를 붙여서 static 필드를 만들수 있다.
	//필드는 선언시에 초기값을 넣어줄수도 있다.
	public static String version="1.0";
	
	//method 의 return type 앞에 static 예약어를 붙여서 static 메소드를 만들수 있다.
	public static void send() {
		System.out.println("전송합니다.");
	}
}
