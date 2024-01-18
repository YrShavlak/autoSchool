/*
     В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу,
     округляющую число n до ближайшего целого и выводящую результат на экран.

 */
import java.util.Scanner;
public class RoundNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number with fractional part: ");
        double n = scanner.nextDouble();

        int round_number = (int) Math.round(n);

        System.out.println("Round number: " + round_number );
        scanner.close();
    }
}
