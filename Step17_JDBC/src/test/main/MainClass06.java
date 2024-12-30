package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// getList 메서드를 호출해서 회원 목록을 가져오기
        List<MemberDto> list = getList();
        for (MemberDto tmp : list) {
        	System.out.printf("번호:%d, 이름:%s. 주소:%s \r\n",
        			tmp.getNum(), tmp.getName(), tmp.getAddr());
        }
	}
	//미리 준비된 메소드가 있다고 가정하면
	public static List<MemberDto> getList(){
		//리턴해줄 객체를 미리 생성하기
        List<MemberDto> list = new ArrayList<>();
		
        //필요한 객체를 담을 지역변수 미리 준비
  		Connection conn=null;
  		PreparedStatement pstmt=null;
  		ResultSet rs=null;
  		
  		try {
  			//우리가 설계한 클래스로 객체생성후 Connection 객체 얻어내기
  			conn=new DBConnector().getConn();
  			String sql="""
  				SELECT num, name, addr
  				FROM member
  				ORDER bY num ASC
  			""";
  			pstmt=conn.prepareStatement(sql);
  			rs=pstmt.executeQuery();
  			while (rs.next()) {
                int num = rs.getInt("num");
                String name = rs.getString("name");
                String addr = rs.getString("addr");
                //select 된 row 하나의 정보를 MemberDto 객체에 담는다.
                MemberDto member = new MemberDto(num, name, addr);
                //회원 정보가 담긴 MemberDto 객체를 ArrayList 객체에 누적 시킨다.
                list.add(member);
                
  			}
  		}catch(Exception e) {
  			e.printStackTrace();
  		}
  		// 생성된 리스트를 리턴
        return list;
	}
}
