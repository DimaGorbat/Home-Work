package HomeWork1;
import java.util.Scanner;
public class Task_4_6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите год: ");
            int a = scan.nextInt();

            if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                System.out.println("Год " + a + " високосный.");
            } else {
                System.out.println("Год " + a + " обычный.");
            }
        }
    }

