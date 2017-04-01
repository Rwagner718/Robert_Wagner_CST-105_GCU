/*CST-105
 *Robert C Wagner
 *Week5 Assignments
 *
 *(Algebra: perfect square) Write a program that prompts the user to enter 
an inte-ger m and find the smallest integer n such that m * n is a perfect 
square. (Hint: Store all smallest factors of m into an array list. n is the 
product of the factors that appear an odd number of times in the array list. 
For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 
2 and 5 appear an odd number of times in the array list. So, n is 10.) Here a
re sample runs:  
 *
 **/
package WeekFiveAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare_11_17 {
    public static void main(String[] args) {
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();

        getFactors(m, factors);

        int smallestSquare = smallestSquare(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int smallestSquare(ArrayList<Integer> factors) {

        int[][] occurrences = copy(factors);
        factors.forEach((i) -> {
            search(occurrences, i);
        });

        // remove duplicates and get odd sequence factors
        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

        // get smallest square by multiplying oddSequenceFactors
        int smallestSquare = 1;
        smallestSquare = oddSequenceFactors.stream().map((i) -> i).reduce(smallestSquare, (accumulator, _item) -> accumulator * _item);
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int[] m1 : m) {
            if (m1[1] % 2 != 0) {
                temp.add(m1[0]);
            }
        }

        // removing duplicates
        ArrayList<Integer> duplicateRemoved = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {

            if (!duplicateRemoved.contains(temp.get(i))) {
                duplicateRemoved.add(temp.get(i));
            }
        }

        return duplicateRemoved;
    }

    private static void search(int[][] m, int number) {
        for (int[] m1 : m) {
            if (m1[0] == number) {
                m1[1]++;
            }
        }
    }

    private static int[][] copy(ArrayList<Integer> factors) {

        int[][] temp = new int[factors.size()][2];

        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = factors.get(i);
        }
        return temp;
    }

    private static void getFactors(int m, ArrayList<Integer> factors) {

        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                factors.add(count);
                m /= count;
            } else {
                count++;
            }
        }
    }

}
    

