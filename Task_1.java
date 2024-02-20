package HomeWork1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");//1000_1001
        int number_1 = scan.nextInt();//считываем число 137
        System.out.println("Введите второе число");//0001_1010
        int number_2 = scan.nextInt();//считываем число 282
        System.out.println("Результат работы оператора & ");
        System.out.println(number_1 & number_2);
        /*
        1000_1001  137
        0001_1010  282
        --------------
        0000_1000  8 -результат работы оператора &
         */
        System.out.println("Результат работы оператора | ");
        System.out.println(number_1 | number_2);
        /*
        1000_1001  137
        0001_1010  282
        --------------
        1001_1011  411 -результат работы оператора |
         */
    }
}
