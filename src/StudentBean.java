import java.sql.Timestamp;

/**
 * ѧ������ʵ��    
 * Ctrl+Shift+F  �Զ��Ű�
 * Ctrl+D		 ����ɾ��
 * Ctrl+Shift+C		  ��ӻ�ȡ������//ע��
 * Ctrl+/��                                  ��ӻ�ȡ������//ע��
 * Ctrl+Shift+/ ��    ���� ע��/*
 * Ctrl+Shift+\  ��   ���� ȡ��ע��/*
 * Ctrl+Shift+O   �Զ�����
 * Ctrl++       �������
 * Ctrl+����      �����С
 * Ctrl+Alt+Down����������������ٸ���һ��
 * Ctrl+Alt+up����������������ٸ���һ��
 * Alt+�� ǰһ���༭��ҳ��
 * Alt+�� ��һ���༭��ҳ��
 * Shift+Ctrl+Enter �ڵ�ǰ�в������(ԭ��ͬ����)
 * Ctrl+/(С����) �۵���ǰ���е����д���
 * Ctrl+��(С����) չ����ǰ���е����д���
 * Ctrl+������   �������
 * alt+shift+s,ȫ�ɿ���o    ��д���췽��
 * alt+shift+s,ȫ�ɿ���C    ��д���췽��
 */
class StudentBean {

	// ����ѧ������ӵ�е�����
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

	//alt+shift+s,ȫ�ɿ���o    ��д���췽��
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
		 * StudentBean caizenghui = new StudentBean();                           // ����һ��ѧ������ StudentBean
		 * StudentBean chenshanbin = new StudentBean(); caizenghui.setStuid(80); //���ö����stuid����Ϊ88
		 * 
		 * System.out.println("caizenghui.stuid=" + caizenghui.stuid);
		 * System.out.println("chenshanbin.stuid=" + chenshanbin.stuid);
		 * System.out.println("caizenghui.getStuid()=" + caizenghui.getStuid());
		 * System.out.println("chenshanbin.getStuid()=" + chenshanbin.getStuid());
		 */
		 
	}

}