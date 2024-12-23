package test.main;

import java.util.ArrayList;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을수 있는 ArrayList 객체를 생성해서 참조값을 members 라는
		//지역변수에 담아 보세요.
		ArrayList<MemberDto> members = new ArrayList<>();
		
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아 보세요. (MemberDto 객체가 3개 생성되어야 함)
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("정홍석1");
		dto1.setAddr("수원");
		
		MemberDto dto2 = new MemberDto(2, "정이선2", "수원");
		MemberDto dto3 = new MemberDto(3, "장희주3", "건대");
		
		//3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		 
		//4. 반복문을 이용해서 members 에 들어 있는 회원정보를 출력해 보세요.
		for(MemberDto tmp:members) {
		//String 클래스의 format() 이라는 static 메소드를 이용해서 원하는 문자열 형식을 만든다음
		String info = String.format("번호: %d, 이름: %s, 주소: %s",
									tmp.getNum(), tmp.getName(), tmp.getAddr());
		//콘솔창에 출력하기
		System.out.println(info);
		}
		
		//테스트 메소드 호출 (매개 변수에 전달할 String type 의 갯수는 유동적이다)
		test();
		test("kim");
		test("kim", "lee", "park");
		
	}
	
	//...테스트
	
	public static void test(String... msgs) {
		// String... 은 String[] type 이다
		String[] a =msgs;
	}
}
