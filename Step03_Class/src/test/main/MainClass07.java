package test.main;

import test.mypac.MyUtil;
import test.mypac.YourUtil;

/*
 * 	[ static ]
 * 
 * 	- static 예약어를 붙여서 필드나 메소드를 정의하면 클래스와 함께 static 영역에 만들어 진다.
 * 	- static 필드나 메소드를 사용할때는 클래스명에 . 찍어서 사용하면 된다.
 * 	
 * 	MyUtil.version	// static 필드 참조
 * 
 * 	MyUtil.send()	// static 메소드 호출
 * 
 */
public class MainClass07 {

	public static void main(String[] args) {
		//MyUtil 클래스의 static 메소드 호출
		MyUtil.send();
		//MyUtil 클래스의 static 필드 참조
		String a = MyUtil.version;
		
		YourUtil.remove();
		String b = YourUtil.color;
		
	}

}
