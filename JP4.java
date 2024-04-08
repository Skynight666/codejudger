import java.util.Scanner;
public class JP4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int c1 = 1;
        int c2 = 1;
        for (int i = 2; i <= n1; i++) {
            if (n1%i==0&&n2%i==0) {
                c1 = i;
            }
        }
        System.out.println(c1);
        for (int i = n2; i > 1; i++) {
            if (i%n1==0&&i%n2==0) {
                c2 = i;
                break;
            }
        }
        System.out.println(c2);
    }
}
