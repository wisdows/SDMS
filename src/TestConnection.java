import java.sql.*;	//������ص�����
/**
 * 
 * @author Administrator
 *
 *172.25.6.200
*javac -Djava.ext.dirs=./lib TestConnection.java
*java -Djava.ext.dirs=./lib TestConnection
 */
class TestConnection{
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");															//��������������
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws Exception{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		return conn;																						//��ȡһ�����Ӷ��󣬲�����
	}
	public static void main(String[] args) throws Exception{
		Connection c=getConnection();
		System.out.println("c="+c);
		c.close();																							//�����Ƿ����ӳɹ�
	}
	
	
}