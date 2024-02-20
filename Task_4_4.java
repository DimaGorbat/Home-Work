package HomeWork1;
import java.util.Scanner;
public class Task_4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = scan.nextInt();

        System.out.println("Укажите направление перевода (b - в байты, k - в килобайты): ");
        char choice = scan.next().charAt(0);

        switch (choice) {
            case 'b':
                int bytes = a * 1024;
                System.out.println("Число " + a + " в байтах: " + bytes);
                break;
            case 'k':
                int kilobytes = a / 1024;
                System.out.println("Число " + a + " в килобайтах: " + kilobytes);
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите 'b' или 'k'.");
        }
    }
}

