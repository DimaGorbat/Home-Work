package HomeWork1;
import java.util.Scanner;

public class Task_4_5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите целое число (код символа по таблице ASCII): ");
            int a = scan.nextInt();

            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                System.out.println("Это код английской буквы.");
            } else {
                System.out.println("Это какой-либо иной символ.");
            }
        }
    }


