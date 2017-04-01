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
class Faculty extends Employee{
    private Double officeHours;
    private String rank;

    public Faculty(String person) {
        super(person);
    }

    /**
     * @return the officeHours
     */
    public Double getOfficeHours() {
        return officeHours;
    }

    /**
     * @param officeHours the officeHours to set
     */
    public void setOfficeHours(Double officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

   
    }

    
    

