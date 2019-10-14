import java.sql.*;	//导入相关的类型
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
			Class.forName("com.mysql.jdbc.Driver");															//加载驱动程序类
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws Exception{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		return conn;																						//获取一个连接对象，并返回
	}
	public static void main(String[] args) throws Exception{
		Connection c=getConnection();
		System.out.println("c="+c);
		c.close();																							//测试是否连接成功
	}
	
	
}