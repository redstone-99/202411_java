package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnector;

public class MainClass07 {
	public static void main(String[] args) {
		// getList 메서드를 호출해서 사원 목록을 가져오기
        List<EmpDto> list = getList();
        for (EmpDto tmp : list) {
        	System.out.printf("사원번호:%d, 사원이름:%s, 직종:%s, 급여:%.2f \r\n",
        			tmp.getEmpno(), tmp.getEname(), tmp.getJob(), tmp.getSal());
        }
	}
	//미리 준비된 메소드가 있다고 가정하면
	public static List<EmpDto> getList(){
		//리턴해줄 객체를 미리 생성하기
        List<EmpDto> list = new ArrayList<>();
		
        //필요한 객체를 담을 지역변수 미리 준비
  		Connection conn=null;
  		PreparedStatement pstmt=null;
  		ResultSet rs=null;
  		
  		try {
  			//우리가 설계한 클래스로 객체생성후 Connection 객체 얻어내기
  			conn=new DBConnector().getConn();
  			String sql="""
  				SELECT empno, ename, job, sal
  				FROM emp
  			""";
  			pstmt=conn.prepareStatement(sql);
  			rs=pstmt.executeQuery();
  			while (rs.next()) {
  				//ResultSet 객체로 부터 사원 한명의 정보를 추출 했다.
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                //select 된 row 하나의 정보를 MemberDto 객체에 담는다.
                EmpDto emp = new EmpDto(empno, ename, job, sal);
                //회원 정보가 담긴 MemberDto 객체를 ArrayList 객체에 누적 시킨다.
                list.add(emp);
                
  			}
  		}catch(Exception e) {
  			e.printStackTrace();
  		}
  		// 생성된 리스트를 리턴
        return list;
	}
}