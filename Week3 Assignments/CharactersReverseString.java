/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Print the characters in a string reversely) Write a recursive method that dis-plays 
a string reversely on the console using the following header:

public static void reverseDisplay(String value)  

For example, reverseDisplay("abcd") displays dcba. Write a test program that prompts the 
user to enter a string and displays its reversal. 
 *
 **/
package week3.assignments;

import java.util.Scanner;
public class CharactersReverseString {
    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1) + "\n");
        reverseDisplay(value.substring(0, value.length()-1));
    }
}

