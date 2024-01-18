/*
    Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую
    подстроку вводит пользователь.
 */

import java.util.Scanner;

public class StringManipulation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter substring for changes: ");
        String targetSubstring = scanner.nextLine();

        System.out.println("Enter new substring: ");
        String newSubstring = scanner.nextLine();

        String resultString = inputString.replace(targetSubstring, newSubstring);
        System.out.println("Result: " + resultString);

        scanner.close();

    }

}
