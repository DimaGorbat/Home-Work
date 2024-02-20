package HomeWork1;

import java.util.Random;

public class Task_1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        a = random.nextInt(100);
        double b = 42.5;
        int res = a | (int) b; // преобразуем 42.5 в целочисленный тип
        System.out.println("Результат |: " + res);
    }
}
