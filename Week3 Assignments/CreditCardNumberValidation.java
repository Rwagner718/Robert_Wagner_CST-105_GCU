/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Financial: credit card number validation) Credit card numbers follow certain pat-terns. 
A credit card number must have between 13 and 16 digits. It must start with: 
■ 4 for Visa cards 
■ 5 for Master cards 
■ 37 for American Express cards 
■ 6 for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. 
The algorithm is useful to determine whether a card number is entered correctly or whether 
a credit card is scanned correctly by a scanner. Credit card numbers are generated following 
this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described 
as follows (for illustra-tion, consider the card number 4388576018402626):  
 *
 *
 **/
package week3.assignments;

import java.util.Scanner;
public class CreditCardNumberValidation {
    public static final int PREFIX_VISA = 4;
    public static final int PREFIX_MASTER = 5;
    public static final int PREFIX_AMERICAN_XP = 37;
    public static final int PREFIX_DISCOVERS = 6;

    private static int[] prefixes = new int[] {
            PREFIX_VISA, PREFIX_MASTER, PREFIX_AMERICAN_XP, PREFIX_DISCOVERS
    };

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long creditCardNum = input.nextLong();

        if (isValid(creditCardNum)) {
            System.out.println(creditCardNum + " is valid.");
        } else {
            System.out.println(creditCardNum + " is INVALID");
        }
    }

    /** Return true if the card number is valid
     * @param number
     * @return  */
    public static boolean isValid(long number) {

        if (getSize(number) > 16 || getSize(number) < 13) {
            return false;
        }

        for (int i = 0; i < getPrefixes().length; i++) {

            if (getPrefix(number, getPrefixes()[i]) == getPrefixes()[i]) {
                break; // prefix match
            }
            if (i < getPrefixes().length - 1) {
                return false; // no prefix return false
            }

        }

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sum % 10 == 0;
    }

    /** Return true if the digit d is a prefix for number
     * @param number
     * @param d
     * @return  */
    public static boolean prefixMatched(long number, int d) {

        if (d > number) {
            return false;
        }

        long difference = (getSize(number) - getSize(d));

        return d == (int)(number / Math.pow(10, difference));

    }


    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     * @param number
     * @param k
     * @return  */
    public static long getPrefix(long number, int k) {
        if (prefixMatched(number, k)) {
            return k;
        }

        return number;
    }

    /** Get the result from Step 2
     * @param number
     * @return  */
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        while (number > 0) {
            number /= 10;
            int digit = getDigit((int) (number % 10) * 2);
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    /** Return sum of odd-place digits in number
     * @param number
     * @return  */
    public static int sumOfOddPlace(long number) {

        int sum = 0;
        while (number > 0) {

            int digit = (int) (number % 10);
            digit = getDigit(digit);
            sum += digit;
            number /= 100;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     * @param number
     * @return  */
    public static int getDigit(int number) {

        return (number > 9) ? number - 9 : number;
    }

    /** Return the number of digits in d
     * @param d
     * @return  */
    public static int getSize(long d) {

        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }

    /**
     * @return the prefixes
     */
    public static int[] getPrefixes() {
        return prefixes;
    }

    /**
     * @param aPrefixes the prefixes to set
     */
    public static void setPrefixes(int[] aPrefixes) {
        prefixes = aPrefixes;
    }
}

