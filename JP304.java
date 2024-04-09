import java.util.Scanner;
public class JP304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("fib("+(n-i)+")="+compute(n-i));
        }
    }
    public static int compute(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return compute(n-1)+compute(n-2);
    }
}
