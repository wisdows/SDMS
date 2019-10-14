import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();// 创建一个dao对象
		List<StudentBean> list = dao.findAll();
		
		
		System.out.println("查询结果,共有"+list.size()+"条记录");
		for(StudentBean s:list){
			System.out.println(s.getName());
		}
	}
}
