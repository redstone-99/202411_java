package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		//인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList<>();
		//greets 에 들어 있는 참조값을 이용해서 인사말 3개를 임의로 담아보세요
		greets.add("안녕하세요");
		greets.add("방가워요");
		greets.add("복 받으세요");
		
		//확장 for 문을 이용해서 모든 인사말을 콘솔창에 순서대로 출력해 보세요.
		
		for(String tmp : greets) {	//줄여서 간단히 확장 for 문
			System.out.println(tmp);
		}
		
		System.out.println("---1 ---");
		
		//forEach는 무조건 Consumer 타입이랑 같이 써야한다.
		Consumer<String> con = new Consumer<String>() {
			@Override
			//매개변수 타입은 제너릭 타입을 따라간다. 고려해야한다.
			public void accept(String t) {
				//매개 변수에 전달되는 item 을 가지고 어떤 작업을 할지 여기에 coding 을 하면 된다.
				System.out.println(t);
			}
		};
		/*
		 * 	ArrayList 객체의 forEach() 메소드를 호출시키면서 Consumer type 객체를 전달하면
		 * 	전달된 객체의 accept() 메소드를 호출하면서
		 * 	ArrayList 객체에 저장된 item 을 순서대로 매개 변수에 전달해 준다.
		 */
		greets.forEach(con);
		System.out.println("---2 ---");
		greets.forEach(greet -> System.out.println(greet));
		
		//메소드 한개짜리는 함수 모양으로 가능
		System.out.println("---3 ---");
		Consumer<String> con2 = (t) ->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("---4 ---");
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
