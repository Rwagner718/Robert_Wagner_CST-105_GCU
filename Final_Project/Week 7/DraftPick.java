/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *Needs PlayerByName.java, PlayerStats.java, and NFLPlayerByPosition.java
 *

 *
 **/
package FinalProject;

import java.util.Arrays;
import java.util.Scanner;

public class DraftPick {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        NFLPlayerByPosition position = new NFLPlayerByPosition();
        PlayerStats stats = new PlayerStats();
        PlayerByName name = new PlayerByName();
        boolean again = true;
        
        while(again){
            System.out.print("Select from the following: \n" + "Offense (1)\n" + "Defense (2)\n");
            int q2 = input.nextInt();
                if(q2 == 1){
                    System.out.print("Select from the following: \n" + "Quarterbacks(1)\n" + 
                            "Running Backs(2)\n" + "Wide Receivers(3)\n" + "Tight Ends(4)\n");
                    int q3 = input.nextInt();
                        if(q3 == 1){
                            System.out.println("The offensive picks are: \n" + Arrays.toString(position.getQuarterBacks()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP1()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat1()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP2()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat2()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP3()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat3()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP4()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat4()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP5()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat5()) + "\n");
                                }
                        }
                        if(q3 == 2) {
                            System.out.println("The offensive picks are: \n" + Arrays.toString(position.getRunningBacks()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP6()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat6()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP7()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat7()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP8()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat8()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP9()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat9()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP10()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat10()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP11()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat11()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP12()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat12()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP13()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat13()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP14()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat14()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP15()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat15()) + "\n");
                                }
                        }
                        if(q3 == 3) {
                            System.out.println("The offensive picks are: \n" + Arrays.toString(position.getWideRecievers()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP16()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat16()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP17()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat17()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP18()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat18()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP19()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat19()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP20()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat20()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP21()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat21()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP22()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat22()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP23()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat23()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP24()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat24()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP25()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat25()) + "\n");
                                }
                        }
                        if(q3 == 4) {
                            System.out.println("The offensive picks are: \n" + Arrays.toString(position.getTightEnds()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP26()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat26()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP27()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat27()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP28()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat28()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP29()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat29()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP30()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat30()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP31()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat31()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP32()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat32()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP33()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat33()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP34()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat34()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP35()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat35()) + "\n");
                                }
                        }
                    }
                else if(q2 == 2){
                    System.out.print("Select from the following: \n" + "Defensive Line(1)\n" +
                            "Line Backers(2)\n" + "Defensive Backs(3)\n" + "Kickers(4)\n");
                    int q4 = input.nextInt();
                        if(q4 == 1){
                            System.out.println("The defensive picks are: \n" + Arrays.toString(position.getDefenseLine()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP36()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat36()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP37()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat37()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP38()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat38()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP39()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat39()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP40()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat40()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP41()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat41()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP42()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat42()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP43()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat43()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP44()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat44()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP45()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat45()) + "\n");
                                }
                        }
                        if(q4 == 2) {
                            System.out.println("The defensive picks are: \n" + Arrays.toString(position.getLineBackers()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP46()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat46()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP47()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat47()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP48()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat48()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP49()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat49()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP50()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat50()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP51()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat51()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP52()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat52()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP53()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat53()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP54()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat54()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP55()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat55()) + "\n");
                                }
                        }
                        if(q4 == 3) {
                            System.out.println("The defensive picks are: \n" + Arrays.toString(position.getDefensiveBacks()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP56()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat56()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP57()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat57()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP58()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat58()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP59()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat58()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP60()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat60()) + "\n");
                                }
                                if(playerNum == 6){
                                    System.out.println(Arrays.toString(name.getP61()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat61()) + "\n");
                                }
                                if(playerNum == 7){
                                    System.out.println(Arrays.toString(name.getP62()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat62()) + "\n");
                                }
                                if(playerNum == 8){
                                    System.out.println(Arrays.toString(name.getP63()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat63()) + "\n");
                                }
                                if(playerNum == 9){
                                    System.out.println(Arrays.toString(name.getP64()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat64()) + "\n");
                                }
                                if(playerNum == 10){
                                    System.out.println(Arrays.toString(name.getP65()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat65()) + "\n");
                                }
                        }
                        if(q4 == 4) {
                            System.out.println("The defensive picks are: \n" + Arrays.toString(position.getFieldGoalKickers()));
                            System.out.print("Select your player to view stats: \n");
                            int playerNum = input.nextInt();
                                if(playerNum == 1){
                                    System.out.println(Arrays.toString(name.getP66()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat66()) + "\n");
                                }
                                if(playerNum == 2){
                                    System.out.println(Arrays.toString(name.getP67()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat67()) + "\n");
                                }
                                if(playerNum == 3){
                                    System.out.println(Arrays.toString(name.getP68()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat68()) + "\n");
                                }
                                if(playerNum == 4){
                                    System.out.println(Arrays.toString(name.getP69()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat69()) + "\n");
                                }
                                if(playerNum == 5){
                                    System.out.println(Arrays.toString(name.getP70()) + "\n");
                                    System.out.println(Arrays.toString(stats.getStat70()) + "\n");
                                }
                                
                        }
                    }
                System.out.print("Do you want to search again? y/n: \n");
                String option = input.next();
                again = (option.equalsIgnoreCase("y"));
                }
             
    }}

   


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                    
                    
                    
                    
                    
                    
                    
       
        
        
     
    

