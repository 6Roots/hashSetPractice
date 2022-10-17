package hashSetPractice;

public class Student {
	
	int id;
	String student;
	
	public Student(int id, String student) {
		this.id = id;
		this.student = student;
	}
	
	// int id 와 String student의 값이 같다면 equals의 리턴값이 true가 되도록 오버라이드
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if ( id == stu.id && student == stu.student ) {
				return true;
			} else return false;
		} else return false;
	}
	
	@Override
	public int hashCode() {
		return id + student.hashCode();
	}

}
