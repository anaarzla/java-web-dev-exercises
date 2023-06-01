package studios;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase and I'll count each letter in your phrase: ");
        String quote = input.nextLine().toLowerCase();

        /** String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there."; **/

        char[] charactersInString = quote.toCharArray();
        HashMap<Character,Integer>letterCounts = new HashMap<Character, Integer>();

        for(char letter : charactersInString){
            if(!Character.isAlphabetic(letter)){
                continue;
            }
            if(!letterCounts.containsKey(letter)){
                letterCounts.put(letter, 1);
            }else{
                //letterCounts.computeIfPresent(letter,(key, val) -> val+1);
                letterCounts.put(letter, letterCounts.get(letter)+1);
            }
        }
            for (Map.Entry<Character, Integer>lettersEntry:letterCounts.entrySet()){
                System.out.println(lettersEntry.getKey()+": "+lettersEntry.getValue());
            }

    }
}
