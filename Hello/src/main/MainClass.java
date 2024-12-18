package main;

/*
 * eclipse 에서 진한 파란색으로 표시되는 단어는 예약어 이다.
 * 예약어는 아주 특별히 해석되기로 약속된 단어이기 때문에 식별자(클래스명, 메소드명, 변수명 등등)으로
 * 사용할수 없다.
 */

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("정홍석, 세상!");
		//let num = 10;
		int num = 10;
		
		//let name = "정홍석";
		String name = "정홍석";
		
		//let isMan = true;
		boolean isMan = true;
		
		for(int i=0; i<num; i++) {
			System.out.println(i);
		}
	}
}
