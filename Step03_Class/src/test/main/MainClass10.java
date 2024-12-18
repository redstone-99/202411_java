package test.main;

import test.mypac.Member;

public class MainClass10 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.num(1);
		m1.name("정홍석");
		m1.addr("수원");
		
		Member m2 = new Member().num(2).name("정이선").addr("수원");
		
		//결국 멤버 타입이라서 뒤에. 붙여도 가능 ~ this 리턴
		Member m3 = new Member().num(3).name("윤도현").addr("수원");
		
	}
}
