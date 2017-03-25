/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Game: hangman) Write a hangman game that randomly generates a word and 
prompts the user to guess one letter at a time, as shown in the sample run. 
Each letter in the word is displayed as an asterisk. When the user makes a 
correct guess, the actual letter is then displayed. 
 *

 *
 **/
package WeekFourAssignments;

import java.util.Scanner;
public class Hangman_7_35 {
    private static String[] words = { "programming", "words", "test", "game" };
    private static boolean isCorrect;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playStats = "y";
        while (playStats.equals("y")) {
            String word = getWord();
            String hiddenWord = getHiddenWord(word);
            int missCount = 0;
            while (!word.equals(hiddenWord)) {

                System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
                char ch = input.next().charAt(0);

                if (!isAlreadyInWord(hiddenWord, ch)) {

                    hiddenWord = getGuess(word, hiddenWord, ch);

                    if (!isIsCorrect()) {
                        System.out.println(ch + " is not in the word.");
                        missCount++;
                    }

                } else {
                    System.out.println(ch + " is already in word.");
                }




            }
            System.out.println("The word is program. You missed "+ missCount +  "times");
            System.out.println("Do you want to guess another word? Enter y or n >");
            playStats = input.next();
        }

    }

    public static String getWord() {
        return getWords()[(int) (Math.random() * getWords().length)];
    }

    public static String getHiddenWord(String word) {

        String hidden = "";
        for (int i = 0; i < word.length(); i++) {
            hidden += "*";
        }
        return hidden;
    }

    static public String getGuess(String word, String hiddenWord, char ch) {

        setIsCorrect(false);
        StringBuilder s = new StringBuilder(hiddenWord);
        for (int i = 0; i < word.length(); i++) {

            if (ch == word.charAt(i) && s.charAt(i) == '*') {
                setIsCorrect(true);
                s = s.deleteCharAt(i);
                s = s.insert(i, ch);
            }
        }
        return s.toString();
    }

    public static boolean isAlreadyInWord(String hiddenWord, char ch) {

        for (int i = 0; i < hiddenWord.length(); i++) {

            if (ch == hiddenWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the words
     */
    public static String[] getWords() {
        return words;
    }

    /**
     * @param aWords the words to set
     */
    public static void setWords(String[] aWords) {
        words = aWords;
    }

    /**
     * @return the isCorrect
     */
    public static boolean isIsCorrect() {
        return isCorrect;
    }

    /**
     * @param aIsCorrect the isCorrect to set
     */
    public static void setIsCorrect(boolean aIsCorrect) {
        isCorrect = aIsCorrect;
    }
}


