package test.main;

import test.mypac.Member;

public class MainClass09 {

	public static void main(String[] args) {
		/*
		 * 	Member 객체를 3개 생성해서 각각의 객체에 3명의 정보를 담아 보세요.
		 */
		
		// 기본 생성자를 이용해서 객체 생성
        Member m1 = new Member();
        Member m2 = new Member();
        // 매개변수에 값을 3개 전달받는 생성자를 이용해서 객체 생성
        Member m3 = new Member(3, "노혁천", "수원");
        
        m1.num = 1;
        m1.name = "정홍석";
        m1.addr = "수원";
        
        m2.num = 2;
        m2.name = "정이선";
        m2.addr = "수원";
        
        m1.showInfo();
        m2.showInfo();
        m3.showInfo();
	}
}
