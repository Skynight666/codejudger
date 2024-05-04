import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int n = scanner.nextInt();
        if (s1.length() != s2.length() || s1.length() > 128||s2.length() > 128) {
            scanner.close();
            return;
        }

        if (n > s1.length()) {
            System.out.println("error");
        } else {
            String sub1 = s1.substring(0, n);
            String sub2 = s2.substring(0, n);
            int result = sub1.compareTo(sub2);
            if (result < 0) {
                System.out.println(s1 + " < " + s2);
            } else if (result > 0) {
                System.out.println(s1 + " > " + s2);
            } else {
                System.out.println(s1 + " = " + s2);
            }
        }
        scanner.close();
    }
}
