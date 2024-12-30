package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		/*
		 * 	MemberDao 객체를 이용해서 1 번 회원의 정보를 삭제해 보세요
		 * 	단) 성공여부를 콘솔창에 출력하세요
		 */
		//입력한 이름과 주소를 MemberDto 객체에 담기
//		MemberDto dto = new MemberDto();
//		dto.setNum(3);
//		
//		MemberDao dao = new MemberDao();
//		boolean isSuccess=dao.delete(dto.getNum());
//		if(isSuccess) {
//			System.out.println("삭제 했습니다.");
//		}else {
//			System.out.println("삭제 실패!");
//		}
		var dao = new MemberDao();
		var isSuccess=dao.delete(1);
		if(isSuccess) {
			System.out.println("삭제 했습니다.");
		}else {
			System.out.println("삭제 실패!");
		}
	}
}
