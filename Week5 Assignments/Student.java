/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekFiveAssignments;

/**
 *
 * @author usmcw
 */
class Student extends Person{
    private String classStatus;

    public Student(String person) {
        super(person);
    }

    /**
     * @return the classStatus
     */
    public String getClassStatus() {
        return classStatus;
    }

    /**
     * @param classStatus the classStatus to set
     */
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    

    
}
    

