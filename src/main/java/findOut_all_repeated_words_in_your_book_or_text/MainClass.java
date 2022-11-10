package findOut_all_repeated_words_in_your_book_or_text;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String specialChar= "[!,\"'+*<>{#.}_¤@~`)£$€%(&:;/?=¨^|´-]";

        System.out.println("Welcome to Word finder.\n ");

        System.out.println("Attach your text here : ");
        String inputText = scanner.nextLine().replaceAll(specialChar, "");
        List<String> tempWordArray = List.of(inputText.split(" "));

        System.out.println("Write the word, you want to find out, how many times it is repeated : ");
        String inputWord = scanner.nextLine();

        int counter = 0;
        for (String item: tempWordArray){
            if (item.equalsIgnoreCase(inputWord)){
               counter++;
            }
        }

        System.out.println("´"+ inputWord + "´ is repeated "+counter + " times.\n");

        int counter2=0;
        for (int i = 0; i < tempWordArray.size(); i++) {
            counter2++;
        }
        System.out.println("Your text contains "+ counter2+ " words.");

        //This app can even spot the words which are attached with special characters like [!,"'+*<>{#.}_¤@~`)£$€%(&:;/?=¨^|´-]
    }
}
