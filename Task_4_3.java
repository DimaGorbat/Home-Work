package HomeWork1;

import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = scan.nextInt();

        System.out.println("Введите второе целое число: ");
        int b = scan.nextInt();

        int c = a % b;
        int d = a / b;

        if (c == 0) {
            System.out.println("Первое число делится на второе нацело.");
        } else {
            System.out.println("Первое число не делится на второе. Остаток от деления: " + c);
        }

        System.out.println("Частное от деления чисел: " + d);
    }
}
