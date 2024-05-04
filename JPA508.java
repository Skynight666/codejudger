import java.util.Scanner;

public class JPA508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();

        if (!n1.matches("[01]{8}") || !n2.matches("[01]{8}")) {
            return;
        }
        int num1 = Integer.parseInt(n1, 2);
        int num2 = Integer.parseInt(n2, 2);
        int sum = num1 + num2;

        if (sum >= 256) {
            System.out.println(num1+" + "+num2+" = " + sum);
            System.out.println("11111111");
        } else {
            System.out.println(num1+" + "+num2+" = " + sum);
            System.out.println(Integer.toBinaryString(sum));
        }
    }
}
