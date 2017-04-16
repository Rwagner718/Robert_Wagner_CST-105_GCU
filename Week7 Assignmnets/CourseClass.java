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
public class CourseClass extends Course1{
    public static void main(String[] args) {

        Course1 course1 = new Course1("Course1");
        course1.addStudent("student1");
        course1.addStudent("student2");
        Course1 course2 = (Course1)course1.clone();
        
        System.out.println(course1 == course2);
        System.out.println(course1.getCourseName() == course2.getCourseName());
        System.out.println(course1.getStudents() == course2.getStudents());
}

    public CourseClass(String courseName) {
        super(courseName);
    }
}
