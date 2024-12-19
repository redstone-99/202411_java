package test.main;

import test.mypac.HandPhone;
//상속 관계 HandPhone . Phone . Object
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 	Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서
		 * 	극 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		HandPhone p1 =new HandPhone();
		//부모 클래스에 정의된 메소드도 사용 가능하다
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
}
