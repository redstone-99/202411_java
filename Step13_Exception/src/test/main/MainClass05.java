package test.main;

public class MainClass05 {
	//throw 하게 되면 메인 메소드에서 익셉션 처리
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//스레드를 일정시간 지연 시키기( mili second 단위로 숫자를 전달하면 된다 )
		Thread.sleep(1000*5);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
