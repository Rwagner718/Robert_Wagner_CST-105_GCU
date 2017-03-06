package week1_assignments;

import java.util.Scanner;
public class Week1_assignment_4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String string1 = input.next();
        System.out.print("Please enter a second String: ");
        String string2 = input.next();
           
        if (isSubstring(string1, string2)) {
            System.out.println("The first string is a substring of the second.");
        } else {
            System.out.println("The first string is NOT a substring of the second.");
        }
    }   

    private static boolean isSubstring(String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
        
        
    }
