package xuankexitong;

public class ChooseCourseByStu {
	// 选课
	public static boolean addStudent(Student stu,Course c) {
		if(c.hasStudent(stu)) return false;
		stu.setCourse(c);
		c.addStudent(stu);
		return true;
	}
	// 移除学生
	public static boolean removeStudent(Student stu,Course c) {
		if(!c.hasStudent(stu)) return false;
		c.rmStudent(stu);
		stu.setCourse(null);
		return true;
	}
	// 显示选课学生：
	public static void displayStudent(Course c) {
		System.out.println("选择的课程：" + c.getName() + "的学生:");
		for (Student s : c.getStudents()) {
			System.out.print(s.getName() + " ");
		}
		System.out.println();
	}
	  //选课管理系统
	 public static void main(String[] args) {
		 Student stu1 = new Student("101","a","男");
		 Student stu2 = new Student("102","b","男");
		 Student stu3 = new Student("103","c","男");
		 
		 Teacher tea1 = new Teacher("201","zhangsan","女");
		 Teacher tea2 = new Teacher("202","lisi","女");
		 Teacher tea3 = new Teacher("203","wangwu","女");
	
		 Course c1 = new Course(1,"高等数学","300","上午9点",tea1);
		 Course c2 = new Course(2,"线性代数","301","上午11点",tea2);
		 Course c3 = new Course(3,"概率论","302","下午1点",tea3);
		 
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