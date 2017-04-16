/*CST-105
 *Robert C Wagner
 *Week6 Assignments
 *
 *(Enable the Courseclasscloneable) Rewrite the Course1 class in Listing 
10.6 to add a clone method to perform a deep copy on the students field. 
 
 *
 **/
package WeekSixAssignments;

/**
 *
 * @author usmcw
 */

public class Course1 implements Cloneable{ 
    private String courseName;
    private String[] students = new String[100]; 
    private int numberOfStudents; 

    public Course1(String courseName) { 
        this.courseName = courseName;
} 

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
}

    public String[] getStudents() {
        return students;
}

    public int getNumberOfStudents() {
        return numberOfStudents;
}

    public String getCourseName() {
        return courseName;
}

public void dropStudent(String student) {
// Left as an exercise in Programming Exercise 10.9
}
} 
