package hashSetPractice;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Set<Student> studentset = new HashSet<Student>();
		
		studentset.add(new Student(3, "ȫ�浿"));
		studentset.add(new Student(2, "�̸���"));
		studentset.add(new Student(1, "���¿�"));
		
		
		Iterator<Student> iterator = studentset.iterator();
		
		while(iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.println("�й� : " + stu.id + " �̸� : " + stu.student);
		}
		
		
	}
}
