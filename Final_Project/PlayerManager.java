/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

/**
 *
 * @author usmcw
 */
public class PlayerManager {
    public static void main(String[] args){
        System.out.println("Begin player name list: \n");
        createPlayers();
        System.out.println("\nEnd player name list: \n");
       
       
             
    }
    public static void createPlayers(){
        String name[] = new String[6];
        name[0] = ("Tom Brady");
        name[1] = ("Matt Ryan");
        name[2] = ("Ezekiel Elliott");
        name[3] = ("Le'Veon Bell");
        name[4] = ("Julian Edelman");
        name[5] = ("Julio Jones");
        
        System.out.println(name[0] + ", " + name[1] + ", " + name[2] + ", " + name[3] + ", " + name[4] + ", " + name[5]);
        
        
    
}

        
        
        
        
    }



