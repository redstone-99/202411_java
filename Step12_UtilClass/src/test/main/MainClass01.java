package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//java 에서 배열은 용도가 한정되어 있다.	item 을 담을수 있는 공간을 늘리거나 줄일수 없다.
		
		//문자열(String) type 을 담을수 있는 방 5개 짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "정홍석";
		names[1] = "정이선";
		names[2] = "장희주";
		
		//객체는 필드와 메소드로 이루어져 있다
		ArrayList<String> friends = new ArrayList<>();
		//정홍석, 정이선, 장희주 를 순서대로 담아 보세요 (3줄 코딩)
		friends.add("정홍석");
		friends.add("정이선");
		friends.add("장희주");
		//0 번방의 아이템을 불러와서 item 이라는 변수에 담기
		String item = friends.get(0);	//String 타입
		//1 번방의 아이템을 삭제
		friends.remove(1);
		//참조값으로 삭제도 가능
		//friends.remove("정홍석");
		//0 번방에 "에이콘"을 끼워넣기
		friends.add(0, "에이콘");
		//저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담기
		int size = friends.size();
		//저장된 모든 아이템 전체 삭제
		friends.clear();
	}
}
