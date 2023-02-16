package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            words.add(scanner.nextLine());
        }

        doubleValues(words);

        // Print result
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void doubleValues(ArrayList<String> list) {
        ArrayList<String> tempList = new ArrayList<>(list);
        list.clear();
        for (String s : tempList) {
            list.add(s);
            list.add(s);
        }
    }
}

