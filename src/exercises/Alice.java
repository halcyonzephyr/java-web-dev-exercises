package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a term to search for in the first sentence of Alice's Adventures in Wonderland:");
        String searchTerm = input.nextLine();
        input.close();

        boolean textContainsSearch = aliceText.contains(searchTerm);
        
        int location = aliceText.indexOf(searchTerm);
        int length = searchTerm.length();
        String newAliceTextPrefix = aliceText.substring(0,length);
        String newAliceTextSuffix = aliceText.substring(length, aliceText.length());
        String newAliceTextConcatonated = newAliceTextPrefix.concat(newAliceTextSuffix);


        System.out.println("The notion that your search term is found in Alice in Wonderland is " + textContainsSearch + ". You can find your search term at index " + location + ". Its length is " + length + ". Without the term, the text would read: ");

        System.out.println(newAliceTextConcatonated);

    }
}
