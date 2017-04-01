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
class Staff extends Employee{
    private String title;

    public Staff(String person) {
        super(person);
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    

    

    
}
