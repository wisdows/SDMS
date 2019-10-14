import java.sql.Timestamp;

/**
 * 学生对象实体    
 * Ctrl+Shift+F  自动排版
 * Ctrl+D		 批量删除
 * Ctrl+Shift+C		  添加或取消批量//注释
 * Ctrl+/：                                  添加或取消批量//注释
 * Ctrl+Shift+/ ：    批量 注释/*
 * Ctrl+Shift+\  ：   批量 取消注释/*
 * Ctrl+Shift+O   自动导包
 * Ctrl++       字体调大
 * Ctrl+——      字体调小
 * Ctrl+Alt+Down，即可以向下面快速复制一行
 * Ctrl+Alt+up，即可以向上面快速复制一行
 * Alt+← 前一个编辑的页面
 * Alt+→ 下一个编辑的页面
 * Shift+Ctrl+Enter 在当前行插入空行(原理同上条)
 * Ctrl+/(小键盘) 折叠当前类中的所有代码
 * Ctrl+×(小键盘) 展开当前类中的所有代码
 * Ctrl+鼠标左键   进入出处
 * alt+shift+s,全松开，o    重写构造方法
 * alt+shift+s,全松开，C    重写构造方法
 */
class StudentBean {

	// 定义学生对象拥有的属性
	private Integer stuid;
	private String name;
	private boolean sex;
	private String mobile;
	private Timestamp birthday;
	private String place;
	private String major;
	private String note;


	
	
	

	public StudentBean() {
	
	}

	//alt+shift+s,全松开，o    重写构造方法
	public StudentBean(Integer stuid, String name, boolean sex, String mobile, Timestamp birthday, String place,
			String major, String note) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.sex = sex;
		this.mobile = mobile;
		this.birthday = birthday;
		this.place = place;
		this.major = major;
		this.note = note;
	}

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public static void main(String[] args) {
		
		/*
		 * StudentBean caizenghui = new StudentBean();                           // 创建一个学生对象 StudentBean
		 * StudentBean chenshanbin = new StudentBean(); caizenghui.setStuid(80); //设置对象的stuid属性为88
		 * 
		 * System.out.println("caizenghui.stuid=" + caizenghui.stuid);
		 * System.out.println("chenshanbin.stuid=" + chenshanbin.stuid);
		 * System.out.println("caizenghui.getStuid()=" + caizenghui.getStuid());
		 * System.out.println("chenshanbin.getStuid()=" + chenshanbin.getStuid());
		 */
		 
	}

}