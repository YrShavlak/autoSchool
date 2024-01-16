/*
    Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
    Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя, считывать введенное
    имя с консоли и выводить на экран приветствие “Hello, %name%”.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        printHelloName();
    }

    private static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
