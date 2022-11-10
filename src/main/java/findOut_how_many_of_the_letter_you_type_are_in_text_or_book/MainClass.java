package findOut_how_many_of_the_letter_you_type_are_in_text_or_book;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String specialChar= "[!,\"'+*<>{#.}_¤@~`)£$€%(&:;/?=¨^|´-]";

        System.out.println("Add your text here : ");
        String inputText2 = scanner.nextLine().replaceAll(specialChar, "");
        List<String> temp2 = List.of(inputText2.split(""));

        System.out.println("Write a letter to see how many words start with it : ");
        String inputCharacter1 = scanner.nextLine();

        int counter2 = 0;
        for (int i = 0; i < temp2.size(); i++) {
            if (temp2.get(i).contains(inputCharacter1)) {
                counter2++;
            }
        }
        System.out.println("There is " + counter2 + " ´"+inputCharacter1+"' in your text. " );
    }
}
