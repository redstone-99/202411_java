package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.util.DBConnector;

public class MainClass08 {
	public static void main(String[] args) {
		// getList 메서드를 호출해서 사원 목록을 가져오기
		List<DeptDto> list = getList();
		for (DeptDto tmp : list) {
			System.out.printf("부서번호:%d, 부서이름:%s, 부서위치:%s \r\n", tmp.getDeptno(), tmp.getDname(), tmp.getLoc());
		}
	}

	// 미리 준비된 메소드가 있다고 가정하면
	public static List<DeptDto> getList() {
		// 리턴해줄 객체를 미리 생성하기
		List<DeptDto> list = new ArrayList<>();

		// 필요한 객체를 담을 지역변수 미리 준비
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 우리가 설계한 클래스로 객체생성후 Connection 객체 얻어내기
			conn = new DBConnector().getConn();
			String sql = """
						SELECT deptno, dname, loc
						FROM dept
					""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// ResultSet 객체로 부터 사원 한명의 정보를 추출 했다.
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				// select 된 row 하나의 정보를 MemberDto 객체에 담는다.
				DeptDto emp = new DeptDto(deptno, dname, loc);
				// 회원 정보가 담긴 MemberDto 객체를 ArrayList 객체에 누적 시킨다.
				list.add(emp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 생성된 리스트를 리턴
		return list;
	}
}
