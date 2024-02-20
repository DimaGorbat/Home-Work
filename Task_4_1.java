package HomeWork1;

import java.util.Random;

public class Task_4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a, b;

        do {
            a = random.nextInt(50);
            b = random.nextInt(50);
        } while (a % 2 == b % 2);

        if (a % 2 !=0) {
            System.out.println("Нечетное число - " + a);
        } else {
            System.out.println("Нечетное число - " + b);
        }
    }
}
