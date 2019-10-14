import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private Connection conn; // ���Ӷ���
	private PreparedStatement pst; // ִ��sq1����Ķ���
	private ResultSet res; // ���������

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
			pst = conn.prepareStatement(sql);		//Ԥ���������sq1���
			res = pst.executeQuery();				//ִ��sq1��䣬�ѽ������res
			while(res.next()){						//next ����Ƿ��м�¼������еĻ��Զ�ת����һ��
				Integer stuid = res.getInt("stuid");
				String name   = res.getString("name");
				boolean sex   = res.getBoolean("sex");
				String mobile = res.getString("mobile");
				Timestamp birthday = res.getTimestamp("birthday");
				String place  = res.getString("place");
				String major  = res.getString("major");
				String note   = res.getString("note");
				
				StudentBean studentBean = new StudentBean(stuid,name,sex,mobile,birthday,place,major,note);
				list.add(studentBean);	//�ϳ�
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	
	
}
