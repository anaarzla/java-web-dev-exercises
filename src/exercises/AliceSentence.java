package exercises;
import java.util.Scanner;

public class AliceSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String AliceTxt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What's the word you want to search for? ");
        String word = input.nextLine();

        /**int wordFinder = **/
                System.out.println(AliceTxt.toLowerCase().contains(word.toLowerCase()));

        /** if(wordFinder == 0 ){
            System.out.println(" Word term was found. ");
        }else{
            System.out.println(" Word term was not found.");
        } **/


    }
}
