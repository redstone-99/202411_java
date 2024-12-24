package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		//1. 세명의 회원정보(번호, 이름, 주소) 를 HashMap 객체를 생성해서 담아 보세요
		//HashMap 객체 하나당 한명의 회원정보를 담으니깐 총 3개의 HashMap 객체가 생성이 되어야 합니다.
		Map<String, Object> member1 = new HashMap<>();
		member1.put("num", 1);
        member1.put("name", "정");
        member1.put("addr", "수원");
        
		Map<String, Object> member2 = new HashMap<>();
		member2.put("num", 2);
        member2.put("name", "홍");
        member2.put("addr", "수투");
        
		Map<String, Object> member3 = new HashMap<>();
		member3.put("num", 3);
        member3.put("name", "석");
        member3.put("addr", "수쓰리");
		
        //in javaScript
        //[{num1:1, name:"xx", addr:"xx"},{},{}]
        
		//2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해 보세요.
        List<Map<String, Object>> memberList = new ArrayList<>();
        
		//3. ArrayList 객체에 HashMap 객체 3개를 담아 보세요.
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);
		
		//4. 반복만 돌면서 ArrayList 에 담긴 회원정보를 콘솔창에 이쁘게 출력해 보세요.
        for (Map<String, Object> tmp : memberList) {
        	String info = String.format("번호: %d, 이름: %s, 주소: %s",
					tmp.get("num"), tmp.get("name"), tmp.get("addr"));
        	System.out.println(info);
        }
        
	}
}
