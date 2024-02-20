package HomeWork1;
import java.util.Scanner;

public class Task_6_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите ваше имя: ");
            String name = scan.nextLine();

            if (name.equals("Вася")) {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
            } else if (name.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }


