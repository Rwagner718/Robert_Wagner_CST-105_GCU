/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Occurrences of a specified character in a string) Rewrite Programming 
Exer-cise 18.10 using a helper method to pass the substring high index to the method. 
The helper method header is:

public static int count(String str, char a, int high)      
 *
 *
 **/
package week3.assignments;

import java.util.Scanner;
public class OccurancesPart2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string and one character out of that string to find occurrence: \n");
        String str = input.next();
        char ch = input.next().charAt(0);
        System.out.println("The number of occurances for " + ch + " in " + str + " is: " +count(str, ch));

    }

    
public static int count(String s, char ch) {
        return count(s, ch, s.length() - 1);
    }
    public static int count(String s, char ch, int high) {
        int n =  (ch == s.charAt(0)) ? 1 : 0;
        if (high <= 0) {
            return n;
        }
        return n + count(s.substring(1), ch, high - 1);
    }
}
    

