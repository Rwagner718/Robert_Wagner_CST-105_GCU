/*CST-105
 *Robert C Wagner
 *Week5 Assignments
 *
 *(TheCourseclass) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class. 
You should not change the original contract of the Course class (i.e., the 
defi-nition of the constructors and methods should not be changed, but the 
private members may be changed.)  
 *
 **/
package WeekFiveAssignments;

import java.util.ArrayList;

public class CourseClass_11_5 {
    private ArrayList<String> courseName = new ArrayList<String>();
    private ArrayList<String> students = new ArrayList<String>();

	public CourseClass_11_5(){	
	}
	
	public CourseClass_11_5(String myCourseName) {
		courseName.add(myCourseName);
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public String getStudents(int num) {
		return students.get(num);
	}

	public int getNumberOfStudents() {
		return students.size()-1;
	}

	public void CourseName(String newCourseName) {
		courseName.add(newCourseName);
	}
	
	public void getCourseName(int num) {
		System.out.println(courseName.get(num));
	}

	public void dropStudent(String student) {
		students.remove(student);
	}
}

