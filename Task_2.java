package HomeWork1;

public class Task_2 {
    public static void main(String[] args) {
        double a = 5 + 2.0 / 8;
        System.out.println("a = " + a);

        double b = (5+2) / 8.0;
        System.out.println("b = " + b);

        int z = 2;
        double c = (5 + z++) / 8.0;
        System.out.println("c = " + c);

        int x = 8;
        double d = (5 + z++) / (double) (--x);
        System.out.println("d = " + d);

        double e;
        e = ((5 * 2) >> z++) / -- x;
        System.out.println("e = " + e);

        boolean g = (5 + 7) > 20;
        int f = g ? 68 : (22 * 2);
        f = f >> z++;
        f = f / --x;
        System.out.println("f = " + f);

        boolean h = (5 + 7) > 20;
        int i = h ? 68 : (22 * 2);
        i = i >> z++;
        i = i / --x;
        System.out.println("i = " + i);

        boolean j = 6 - 2 > 3 && 12 *12 <=119;
        System.out.println("j = " + j);

        boolean k = true && false;
        System.out.println("k = " + k);
    }
}
