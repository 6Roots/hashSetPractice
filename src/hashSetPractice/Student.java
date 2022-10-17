package hashSetPractice;

public class Student {
	
	int id;
	String student;
	
	public Student(int id, String student) {
		this.id = id;
		this.student = student;
	}
	
	// int id �� String student�� ���� ���ٸ� equals�� ���ϰ��� true�� �ǵ��� �������̵�
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
