import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private Connection conn; // 连接对象
	private PreparedStatement pst; // 执行sq1命令的对象
	private ResultSet res; // 结果集对象

	public void open() {
		try {
			conn = TestConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void close() {
		try {
			if (res != null) {
				res.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public List<StudentBean> findAll() {
		List<StudentBean> list = new ArrayList<StudentBean>();
		open();
		String sql="SELECT * FROM tbl_stuinfo";
		try {
			pst = conn.prepareStatement(sql);		//预处理上面的sq1语句
			res = pst.executeQuery();				//执行sq1语句，把结果交给res
			while(res.next()){						//next 检测是否有记录结果，有的话自动转到第一行
				Integer stuid = res.getInt("stuid");
				String name   = res.getString("name");
				boolean sex   = res.getBoolean("sex");
				String mobile = res.getString("mobile");
				Timestamp birthday = res.getTimestamp("birthday");
				String place  = res.getString("place");
				String major  = res.getString("major");
				String note   = res.getString("note");
				
				StudentBean studentBean = new StudentBean(stuid,name,sex,mobile,birthday,place,major,note);
				list.add(studentBean);	//上车
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	
	
}
