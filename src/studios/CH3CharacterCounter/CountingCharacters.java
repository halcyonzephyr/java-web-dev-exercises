package studios.CH3CharacterCounter;

import java.util.HashMap;
import java.util.Scanner;
public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String paragraph = input.nextLine();
        if (paragraph.isEmpty()) {
            System.out.print("Please follow the dang ol instructions: ");
        } else {
            char[] charactersInString = paragraph.toLowerCase().toCharArray();
            HashMap<Character, Integer> alphabet = new HashMap<>();
            for (char c : charactersInString) {
                if (Character.isLetter(c)) {
                    if (!alphabet.containsKey(c)) {
                        alphabet.put(c, 1);
                    } else {
                        int count = alphabet.get(c) + 1;
                        //count ++;
                        alphabet.replace(c, count);
                    }
                }
            }
            System.out.println(alphabet);
        }
    }
}