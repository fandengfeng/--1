package xuankexitong;

import java.util.ArrayList;

public class Course {
	private String name;
	private int id;
	private Teacher teacher;
	private String room;
	private String cTime;
	private ArrayList<Student> students;
	public Course(int id, String name, String room, String cTime, Teacher teacher) {
		this.name = name;
		this.id = id;
		this.teacher = teacher;
		teacher.setCourse(this);
		this.cTime = cTime;
		this.room = room;
		this.students = new ArrayList<>();
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getcTime() {
		return cTime;
	}
	public void setcTime(String cTime) {
		this.cTime = cTime;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public boolean hasSpace() {
		return this.students.size() < 30;
	}
	public boolean hasStudent(Student stu) {
		return this.students.contains(stu);
	}
	public boolean addStudent(Student stu) {
		if (!hasSpace())
			return false;
		this.students.add(stu);
		return true;
	}
	public void rmStudent(Student stu) {
		this.students.remove(stu);
	}
	public ArrayList<Student> getStudents() {
		return this.students;
	}
	public String toString() {
		return "�γ���Ϣ��\n"
				+ "�γ����ƣ�"+getName()+"\n"
				+ "�γ̱�ţ�"+getId()+"\n"
				+ "�γ�������"+students.size()+"\n"
				+ "�γ̵ص㣺"+getRoom()+"\n"
				+ "�γ�ʱ�䣺"+getcTime()+"\n"
				+ "�ο���ʦ��"+getTeacher().getName()+"\n";
	}
}