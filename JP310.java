import java.util.Scanner;
public class JP310 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = compute(n);
        System.out.println(sum);
    }
    public static int compute(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (s(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
    public static boolean s(int num) {
        int a, b, c = 0, n = 0;
        a = num;
        while (a != 0) {
            a /= 10;
            n++;
        }
        a = num;
        while (a != 0) {
            b = a % 10;
            c += Math.pow(b, n);
            a /= 10;
        }
        return c == num;
    }
}
