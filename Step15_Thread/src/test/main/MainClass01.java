package test.main;

public class MainClass01 {
	public static void main(String[] args) {	//스레드(main) 스레드는 실행의 흐름
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			Thread.sleep(5000);		//5초 동안 스레드가 진행되지 않음
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		test();	//test()메소드 안쪽으로 실행의 흐름이 넘어간다.
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	public static void test() {
		System.out.println("test() 메소드 호출됨");
	}
}
