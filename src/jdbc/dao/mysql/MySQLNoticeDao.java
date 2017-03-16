package jdbc.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.data.dao.NoticeDao;
import jdbc.data.entity.Member;
import jdbc.data.view.NoticeView;

public class MySQLNoticeDao implements NoticeDao {

	@Override
	public List<NoticeView> getList() {
		
		return getList(1, "TITLE", "");
	}

	@Override
	public List<NoticeView> getList(int page) {
		
		return getList(page, "TITLE", "");
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		
		String sql = "SELECT  * FROM MEMBER WHERE MID LIKE '%"+query+"%'";
		List<Member> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
					
			Member member = null;

			while(rs.next()){
				member = new Member();
				member.setMid(rs.getString("MID"));
				member.setPwd(rs.getString("PWD"));
				
				list.add(member);
			}
							
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}





















