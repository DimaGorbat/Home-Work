package HomeWork1;


import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите 3 числа");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if ((a > b && a < c) || (a < b && a > c))
                System.out.println("Средним является число а " + a);
            else if ((b > a && b < c) || (b < a && b > c))
                System.out.println("Средним является число b " + b);
            else System.out.println("Средним является число c " + c);
    }
}