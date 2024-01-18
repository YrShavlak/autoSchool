import java.util.Scanner;

/*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class StringManipulation3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String longestWord = findLongestWord(words);

        System.out.println("Longest word is - " + longestWord);
    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
