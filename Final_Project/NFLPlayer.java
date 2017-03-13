package FinalProject;

import java.util.Scanner;
/*The three property types are:
1. Name
2. Position
3. Statistics

*/
public class NFLPlayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                
                while(true){
		System.out.print("View player by name (1) or position (2): ");
		int choice = input.nextInt();
                if(choice == 1) {
                    System.out.print("Tom Brady (1)\n");
                    System.out.print("Matt Ryan (2)\n");
                    System.out.print("Ezekiel Elliott (3)\n");
                    System.out.print("Le'Veon Bell (4)\n");
                    System.out.print("Julian Edelman(5)\n");
                    System.out.print("Julio Jones (6)\n\n");
                    System.out.print("Select player by number: ");
		int choicePlayer = input.nextInt();
                            if(choicePlayer == 1){
                            System.out.println("Comp\tAtt\tPct");
                            System.out.println("93\t142\t65.5\n");
                            }
                            if(choicePlayer == 2){
                            System.out.println("Comp\tAtt\tPct");
                            System.out.println("70\t98\t71.4\n");
                            }
                            if(choicePlayer == 3){
                            System.out.println("Att\tAtt/G\tYds");
                            System.out.println("22\t22.0\t125\n");
                            }
                            if(choicePlayer == 4){
                            System.out.println("Att\tAtt/G\tYds");
                            System.out.println("65\t21.7\t357\n");
                            }
                            if(choicePlayer == 5){
                            System.out.println("Yds\tAvg\tYds/G");
                            System.out.println("342\t16.3\t114.0\n");
                            }
                            if(choicePlayer == 6){
                            System.out.println("Yds\tAvg\tYds/G");
                            System.out.println("334\t17.6\t111.3\n");
                            
                                   
                            }
                             
                   
                    
                   }
                
                            else if(choice == 2){
                             System.out.print("Quarterback(1)\n");
                             System.out.print("Running Back (2)\n");
                             System.out.print("Wide Receiver (3)\n\n");
                             System.out.print("Select desired position: ");
                            int choicePosition = input.nextInt();
                            
                                if(choicePosition == 1){
                                    System.out.println("Tom Brady (1)\n");
                                    System.out.println("Matt Ryan (2)\n");
                                    System.out.print("Select player by number: ");
                                    int playerQB = input.nextInt();
                                        if(playerQB == 1){
                                            System.out.println("Comp\tAtt\tPct");
                                            System.out.println("93\t142\t65.5\n");
                                        }
                                        
                                        if(playerQB == 2){
                                            System.out.println("Comp\tAtt\tPct");
                                            System.out.println("70\t98\t71.4\n");
                                        }
                                }
                                if(choicePosition == 2){
                                    System.out.println("Ezekiel Elliott (1)\n");
                                    System.out.println("Le'Veon Bell (2)\n");
                                    System.out.print("Select player by number: ");
                                    int playerRB = input.nextInt();
                                        if(playerRB == 1){
                                            System.out.println("Att\tAtt/G\tYds");
                                            System.out.println("22\t22.0\t125\n");
                                        }
                                        
                                        if(playerRB == 2){
                                            System.out.println("Att\tAtt/G\tYds");
                                            System.out.println("65\t21.7\t357\n");
                                            
                                        }
                                }
                                
                                if(choicePosition == 3){
                                    System.out.println("Julian Edelman (1)\n");
                                    System.out.println("Julio Jones (2)\n");
                                    System.out.print("Select player by number: ");
                                    int playerWR = input.nextInt();
                                        if(playerWR == 1){
                                            System.out.println("Yds\tAvg\tYds/G");
                                            System.out.println("342\t16.3\t114.0\n");
                                        }
                                        
                                        if(playerWR == 2){
                                            System.out.println("Yds\tAvg\tYds/G");
                                            System.out.println("334\t17.6\t111.3\n");
                                            
                                        }
                                }
                        
                                            
                                        }
                                }
         }
                
                
                            
                
    }
                
   
     
                    
           
		
                
	
            
        
        
     
       
      
		

	



