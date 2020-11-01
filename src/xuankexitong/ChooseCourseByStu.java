package xuankexitong;

public class ChooseCourseByStu {
	// ѡ��
	public static boolean addStudent(Student stu,Course c) {
		if(c.hasStudent(stu)) return false;
		stu.setCourse(c);
		c.addStudent(stu);
		return true;
	}
	// �Ƴ�ѧ��
	public static boolean removeStudent(Student stu,Course c) {
		if(!c.hasStudent(stu)) return false;
		c.rmStudent(stu);
		stu.setCourse(null);
		return true;
	}
	// ��ʾѡ��ѧ����
	public static void displayStudent(Course c) {
		System.out.println("ѡ��Ŀγ̣�" + c.getName() + "��ѧ��:");
		for (Student s : c.getStudents()) {
			System.out.print(s.getName() + " ");
		}
		System.out.println();
	}
	  //ѡ�ι���ϵͳ
	 public static void main(String[] args) {
		 Student stu1 = new Student("101","a","��");
		 Student stu2 = new Student("102","b","��");
		 Student stu3 = new Student("103","c","��");
		 
		 Teacher tea1 = new Teacher("201","zhangsan","Ů");
		 Teacher tea2 = new Teacher("202","lisi","Ů");
		 Teacher tea3 = new Teacher("203","wangwu","Ů");
	
		 Course c1 = new Course(1,"�ߵ���ѧ","300","����9��",tea1);
		 Course c2 = new Course(2,"���Դ���","301","����11��",tea2);
		 Course c3 = new Course(3,"������","302","����1��",tea3);
		 
		 addStudent(stu1,c1);
		 System.out.println(c1);
		 
		 removeStudent(stu1,c1);
		 System.out.println(c1);
		 
		 addStudent(stu2,c2);
		 System.out.println(c2);
		 
		 removeStudent(stu2,c2);
		 System.out.println(c2);
		 
		 addStudent(stu3,c3);
		 System.out.println(c3);
		 
		 removeStudent(stu3,c3);
		 System.out.println(c3);
	 	}
	}