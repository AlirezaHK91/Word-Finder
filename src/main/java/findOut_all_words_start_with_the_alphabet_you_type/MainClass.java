package findOut_all_words_start_with_the_alphabet_you_type;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {
        //Find all words that stars with chosen letter.

        scanner = new Scanner(System.in);
        String specialChar= "[!,\"'+*<>{#.}_¤@~`)£$€%(&:;/?=¨^|´-]";

        System.out.println("Add your text here : ");
        String inputText1 = scanner.nextLine().replaceAll(specialChar, "");
        List<String> temp1 = List.of(inputText1.split(" "));

        System.out.println("Write a letter to see how many words start with it : ");
        String inputCharacter = scanner.nextLine();

        int counter1 = 0;
        for (int i = 0; i < temp1.size(); i++) {
            if (temp1.get(i).startsWith(inputCharacter)) {
                counter1++;
                System.out.println(temp1.get(i));
            }
        }
        System.out.println(counter1 + " words start with " + "'" + inputCharacter + "' .");



    }
}
