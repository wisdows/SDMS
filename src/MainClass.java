import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();// ����һ��dao����
		List<StudentBean> list = dao.findAll();
		
		
		System.out.println("��ѯ���,����"+list.size()+"����¼");
		for(StudentBean s:list){
			System.out.println(s.getName());
		}
	}
}
