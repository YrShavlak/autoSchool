/*
    В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую
    и выводящую на экран сумму цифр числа n.
 */
import java.util.Scanner;
public class SumOfDigits {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two-digit number: ");
        int n = scanner.nextInt();

        int sum_of_digits = (n / 10) + (n % 10);

        System.out.println("Sum of digits " + n + " = " + sum_of_digits);

        scanner.close();
    }
}
