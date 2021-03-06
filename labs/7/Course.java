package lab7;

public class Course {
	private String courseName;
	
	//Creates array of 5
    private String[] students = new String[5];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
 
    //Creates new array and copies contents of old to new
    public void addStudent(String student) {
        if(numberOfStudents == students.length) {
            String[] copy = new String[students.length+5];
            for(int i = 0; i < students.length; ++i) {
                copy[i] = students[i];
            }
            students = copy;
        }
        students[numberOfStudents++] = student;
    }

    //Adds new test clear 
    public void clear() {
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i + 1; j < numberOfStudents; j++)
                    students[j - 1] = students[j];
                numberOfStudents--;
                return;
            }
        }
    }
}


