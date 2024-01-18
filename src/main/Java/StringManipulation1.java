import java.util.Scanner;

public class StringManipulation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();

        // Вывод первого символа
        if (!inputString.isEmpty()) {
            System.out.println("First Symbol: " + inputString.charAt(0));
        } else {
            System.out.println("String is empty.");
        }

        // Вывод последнего символа
        if (!inputString.isEmpty()) {
            System.out.println("Last Symbol: " + inputString.charAt(inputString.length() - 1));
        } else {
            System.out.println("String is empty.");
        }

        // Вывод среднего символа (если он есть)
        if (inputString.length() % 2 == 1) {
            int middleIndex = inputString.length() / 2;
            System.out.println("Middle Symbol: " + inputString.charAt(middleIndex));
        } else {
            System.out.println("No middle symbol");
        }

        // Вывод части строки до первой точки, включая точку
        int dotIndex = inputString.indexOf('.');
        if (dotIndex != -1) {
            String substringBeforeDot = inputString.substring(0, dotIndex + 1);
            System.out.println("Part of string to dot: " + substringBeforeDot);
        } else {
            System.out.println("Dot is not found in the string.");
        }

        // Вывод количества пробелов/
        int spaceCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isWhitespace(inputString.charAt(i))) {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces in a string : " + spaceCount);
    }
}

