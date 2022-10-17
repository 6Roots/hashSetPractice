package hashSetPractice;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Set<Student> studentset = new HashSet<Student>();
		
		studentset.add(new Student(3, "È«±æµ¿"));
		studentset.add(new Student(2, "ÀÌ¸ù·æ"));
		studentset.add(new Student(1, "Á¶½Â¿ì"));
		
		
		Iterator<Student> iterator = studentset.iterator();
		
		while(iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.println("ÇĞ¹ø : " + stu.id + " ÀÌ¸§ : " + stu.student);
		}
		
		
	}
}
