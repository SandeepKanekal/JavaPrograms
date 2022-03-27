package Worksheets.Strings;
import java.util.Scanner;

public class VowelInSentence {
    public static void main(String[] args) {  // checks the number of vowel in each word of a sentence
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        sentence += " ";
        StringBuilder word = new StringBuilder();
        int count = 0;
        char letter;
        for (int NoSpaceIndex = 0; NoSpaceIndex < sentence.length(); NoSpaceIndex++) {
            if (sentence.charAt(NoSpaceIndex) != ' ')
                word.append(sentence.charAt(NoSpaceIndex));  // getting the word
            else {
                for (int index = 0; index < word.length(); index++) {
                    letter = word.charAt(index);  // getting each letter from <word>
                    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                            || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                        count++;
                }
                System.out.println(word + " ---> " + count);  // printing the count
                count=0;
                word = new StringBuilder();
            }
        }
        sc.close();
    }
}
