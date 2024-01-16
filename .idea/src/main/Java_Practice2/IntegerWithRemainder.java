/*
    1 В переменных q и w хранятся два натуральных числа. Создайте программу,
      выводящую на экран результат деления q на w с остатком. Пример вывода программы
      (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
 */
import java.util.Scanner;

public class IntegerWithRemainder {
    //1
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the variable q: ");
        int q = scanner.nextInt();

        System.out.print("Enter the value of the variable w: ");
        int w = scanner.nextInt();

        int result = q / w;
        int remainder = q % w;

        System.out.println(q + " / " + w + " = " + result + " and " + remainder + " in the remainder");
        scanner.close();
    }
}

