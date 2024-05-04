import java.util.Scanner;
public class JPA306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf(n + "!=%d\n",compute(n));
            }
    public static int compute(int n) {
        if (n==0){
            return 1;
        } else {
            return n*compute(n-1);
        }
    }
}
