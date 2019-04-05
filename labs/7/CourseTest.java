package lab7;

public class CourseTest {
	public static void main(String[] args) {
        Course course = new Course("Applied Stats");
        
        //Add three students by name
        course.addStudent("Claire");
        course.addStudent("Maddy");
        course.addStudent("Megan");
        
        //Removes one student
        course.dropStudent("Maddy");
        
        //Displays the students
        System.out.println("Students in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
    }

}