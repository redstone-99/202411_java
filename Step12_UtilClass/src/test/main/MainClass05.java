package test.main;

import java.util.ArrayList;

import test.mypac.Car;
import test.mypac.Member;


public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을수 있는 ArratList 객체를 생성해서 참조값을 members 라는
		//List type 지역변수에 담아보세요.
		ArrayList<Member> members = new ArrayList<>();
		
		//2. 3명의 회원정보를 Member 객체에 각각 담아 보세요. (Member 객체가 3개 생성되어야 함)
		
		Member member1 = new Member(1, "정홍석", "수원");
		Member member2 = new Member(2, "정이선", "수원");
		Member member3 = new Member(3, "장희주", "건대");
		//members.add(new Member("벤츠"));
		//Member member2 = new Member(2, "정이선", "수원");
		//3. 위에서 생성된 Member 객체의 참조값을 List 객체에 모두 담아 보세요.
		members.add(member1);
		members.add(member2);
		//members.add(new Member(2, "정이선", "수원"));
		members.add(member3);
		
		/*
		 * 	4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 * 	반복은 돌면서 출력해 보세요.
		 * 
		 * 	번호: 1, 이름: 김구라, 주소: 노량진
		 * 	번호: 2, 이름: 해골, 주소: 행신동
		 */
		for (int i = 0; i < members.size(); i++) {
			Member tmp = members.get(i);
			System.out.println("번호: " + tmp.num + " 이름: " + tmp.name + " 주소: " + tmp.addr);
		}
		
		for(Member tmp:members) {
			//String 클래스의 format() 이라는 static 메소드를 이용해서 원하는 문자열 형식을 만든다음
			String info = String.format("번호: %d, 이름: %s, 주소: %s",
										tmp.num, tmp.name, tmp.addr);
			//콘솔창에 출력하기
			System.out.println(info);
		}
	}
}
