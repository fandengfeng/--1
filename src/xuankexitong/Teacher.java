package xuankexitong;

public class Teacher extends Renyuan {
	private Course course;

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teacher(String id, String name, String sex) {
		super(id, name, sex);
	}
	private String getCourseName() {
		if(course!=null) {
			return course.getName();
		}
		return "�޿�";
	}
    public String toString() {
		return "��ʦ��Ϣ��\n"
				+ "��ʦ������"+getName()+"\n"
				+ "��ʦѧ�ţ�"+getId()+"\n"
				+ "��ʦ�Ա�"+getSex()+"\n"
				+ "���̿γ̣�"+getCourseName();
	}
}