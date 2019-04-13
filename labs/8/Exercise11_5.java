package lab8;

public class Exercise11_5 {
	
	public static void main(String[] args) {
		Course course1 = new Course("AP Chemistry 1");
		Course course2 = new Course("AP Physics 1");

		//Course1 students added
		course1.addStudent("Madison Lee");
		course1.addStudent("Megan Beiermister");
		course1.addStudent("Claire Oberdorf");

		//Course2 students added 
		course2.addStudent("Madison Lee");
		course2.addStudent("Claire Oberdorf");
		course2.addStudent("Greg Kocinski");
		course2.addStudent("Chris Tracz");

		System.out.println("Number of students in AP Chemistry 1: " + course1.getNumberOfStudents());
			String[] students = course1.getStudents();
			for (int i = 0; i < course1.getNumberOfStudents(); i++) {
				System.out.print(students[i] + " ");
			}
				
		System.out.println();
		
		System.out.println("Number of students in AP Physics 1: " + course2.getNumberOfStudents());
			String[] students1 = course2.getStudents();
			for (int i = 0; i < course2.getNumberOfStudents(); i++) {
				System.out.print(students1[i] + " ");
			}
		
		System.out.println();
	}
}