/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectWeek5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author usmcw
 */

    public class PlayerManager{
        
        public static void main(String[] args){
            ArrayList<String> playerList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            boolean again = true;
            
            while(again){
            System.out.print("\nPlace Name: \n");
            String name = input.next();
                                  
            playerList.add(name);
            
            System.out.print("Remove a name? y/n: \n");
            String choice = input.next();
            
            if(choice == "y"){
                System.out.print("Select player to remove: \n" + playerList.toString());
                String remove = input.next();
                
                playerList.remove(remove);
            }
            
            System.out.println("\n" + playerList.toString() + "\n");
            System.out.print("Do you want to add another name? y/n: \n");
                String option = input.next();
                again = (option.equalsIgnoreCase("y"));
        } 
    }
    class CreatePlayer{
        String[] player;
        String[] stats;
            
            
        }  
}

