/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectWeek5;

import FinalProjectWeek5.DefensivePlayer.dPlayer;
import FinalProjectWeek5.OffensivePlayer.oPlayer;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class NFLPlayer {
    
         Scanner input = new Scanner(System.in);
         private String playerName;
         private String playerPos;
        
        
        public NFLPlayer(String playerName, String playerStats){
            this.playerName = playerName;
            this.playerPos = playerStats;
            
        }

   
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String setPlayerPos() {
        return playerPos;
    }

    public void setPlayerPos(String playerStats) {
        this.playerPos = playerStats;
    }
   
public static void main(String[] args){
    
    ArrayList<String> playerList = new ArrayList<>();
        playerList.add(dPlayer.playerName);
        playerList.add(oPlayer.playerName);
        System.out.println(playerList.toString());
    }
}


  
        
       

