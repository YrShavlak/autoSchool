import java.util.Scanner;

public class StringManipulation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();

        if (!inputString.isEmpty()) {
            System.out.println("First Symbol: " + inputString.charAt(0));
        } else {
            System.out.println("String is empty.");
        }

        if (!inputString.isEmpty()) {
            System.out.println("Last Symbol: " + inputString.charAt(inputString.length() - 1));
        } else {
            System.out.println("String is empty.");
        }

        if (inputString.length() % 2 == 1) {
            int middleIndex = inputString.length() / 2;
            System.out.println("Middle Symbol: " + inputString.charAt(middleIndex));
        } else {
            System.out.println("No middle symbol");
        }

        int dotIndex = inputString.indexOf('.');
        if (dotIndex != -1) {
            String substringBeforeDot = inputString.substring(0, dotIndex + 1);
            System.out.println("Part of string to dot: " + substringBeforeDot);
        } else {
            System.out.println("Dot is not found in the string.");
        }

        int spaceCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isWhitespace(inputString.charAt(i))) {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces in a string : " + spaceCount);
    }
}

