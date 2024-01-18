/*
    Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось
    значение a+b, в b хранилась разность старых значений c−a, а в c хранилось сумма старых
    значений a+b+c. Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.
 */
import java.util.Scanner;
public class UpdateValues {
    public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the variable a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of the variable b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of the variable c: ");
        int c = scanner.nextInt();

        a = a + b;
        b = c - a + b;
        c = a + c; // a - c + a + b + c - a - b + c;


        System.out.println("Updated variables: a = " + a + ", b = " + b + ", c = " + c);
    }
}
