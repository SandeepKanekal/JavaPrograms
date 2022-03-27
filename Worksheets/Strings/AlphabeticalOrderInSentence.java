package Worksheets.Strings;
import java.util.Scanner;

public class AlphabeticalOrderInSentence {
    public String order(String sentence) {
        String SentenceInAlphabeticalOrder = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int index = 0; index < sentence.length(); index++) {
                // when <ch> is <a>, whole sentence is looped through and the <a>s in the sentences are concatenated to the variable, this keeps going on till <ch> reaches <z>
                if (ch == sentence.charAt(index))
                    SentenceInAlphabeticalOrder += ch;
            }
        }
        return SentenceInAlphabeticalOrder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a sentence\n");
        AlphabeticalOrderInSentence Ob = new AlphabeticalOrderInSentence();
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase(); // sentence has been lowered since java is case-sensitive
        sentence += " ";
        StringBuilder word = new StringBuilder(); // same as String word = '';
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) != ' ')
                word.append(sentence.charAt(index)); // same as word += sentence.charAt(index);
            else {
                // the word is first converted to the alphabetical order
                System.out.print(Ob.order(word.toString()) + " "); // since <word> is of type <StringBuilder>, it is being converted to <String> using the toString() function
                word = new StringBuilder(); // <word> has no value, to accomodate for the next word
            }
        }
        System.out.println();
        sc.close();
    }
}
