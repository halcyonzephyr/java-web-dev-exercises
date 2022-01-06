package exercises;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> randomNumbers = new ArrayList(
            Arrays.asList(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
            )
        );
        // System.out.println(sumEven(randomNumbers));

        ArrayList<String> wordList = new ArrayList<>(
            Arrays.asList(
                "apple",
                "orange",
                "banana",
                "kiwis",
                "strawberries"
            )
        );

        System.out.println("What length of word do you want? ");
        int wordLength = input.nextInt();
//        letterCounter(wordList, wordLength);
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String str[] = greenEggs.split(" ");
        List nl = new ArrayList();
        nl = Arrays.asList(str);
        letterCounter(nl, wordLength);
    }




    public static int sumEven(ArrayList<Integer> numberArray) {
        int total = 0;
        for(int i : numberArray){
            if(i%2 == 0){
                total += i;
            }
        }
        return total;
    }

    public static void letterCounter(ArrayList<String> wordCollection, int wordLength) {
        for(String word: wordCollection) {

            if(word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
