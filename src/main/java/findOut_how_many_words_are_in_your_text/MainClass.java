package findOut_how_many_words_are_in_your_text;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String specialChar= "[!,\"'+*<>{#.}_¤@~`)£$€%(&:;/?=¨^|´-]";

        System.out.println("Welcome to Word finder.\n ");

        System.out.println("Attach your text here to see how many words are in your text : ");
        String inputText = scanner.nextLine().replaceAll(specialChar, "");
        List<String> tempWordArray = List.of(inputText.split(" "));

        int counter2=0;
        for (int i = 0; i < tempWordArray.size(); i++) {

            counter2++;
        }
        System.out.println("Your text contains "+ counter2+ " words.");
    }
}
