package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		/*
		 * 	Scanner 객체를 이용해서 불러올 회원의 번호를 입력받은 다음
		 * 
		 * 	입력한 번호에 해당하는 회원의 정보를 memberDao 객체를 이용해서 얻어온다음
		 * 
		 * 	해당 회원이 존재하면 해당회원의 정보를 콘솔에 출력하고
		 * 
		 * 	존재하지 않으면 "x번 회원은 존재 하지 않습니다" 를 콘솔창에 출력하는 프로그램을 해 보세요.
		 */
		//이름과 주소를 Scanner 객체로 입력 받아서 DB 에 저장하는 프로그래밍 하기
		Scanner scan = new Scanner(System.in); //용도에 맞게끔 스캐너로 읽어들인다.
		System.out.println("회원번호 입력:");
		int num = scan.nextInt();
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getData(num);
		if (dto != null) {
            System.out.println("회원번호: " + dto.getNum());
            System.out.println("이름: " + dto.getName());
            System.out.println("주소: " + dto.getAddr());
        } else {
            System.out.println(num + "번 회원은 존재하지 않습니다.");
        }
		scan.close();
	}
}
