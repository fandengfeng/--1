package xuankexitong;

public class Student extends Renyuan {
	private Course course;

	public Student(String id, String name, String sex) {
		super(id, name, sex);
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	private String getCourseName() {
		if (course != null) {
			return course.getName();
		}
		return "�޿γ�";
	}
	public String toString() {
		return "ѧ����Ϣ��\n"	+ "ѧ��������" + getName() + "\n" 
							+ "ѧ��ѧ�ţ�" + getId() + "\n"
							+ "ѧ���Ա�" + getSex() + "\n"
							+ "ѡ��γ̣�" + getCourseName();
	}
}