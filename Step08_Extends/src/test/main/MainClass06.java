package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass06 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담아 보세요.
		Car car1 = new Car(new Engine());
		// car1에 들어있는 참조값을 이용해서 .drive() 메소드를 호출해 보세요.
		car1.drive();
	}
}
