/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *Sub Class for TheCourseClass.java

 *
 **/
package WeekFourAssignments;

public class Course {
    private String courseName; 
    private String[] students = new String[100]; 
    private int numberOfStudents; 
    
    public Course(String courseName) { 
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
        
    }
    

} 

