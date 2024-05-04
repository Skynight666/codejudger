import java.util.Scanner;

public class JPA506 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number < 2) {
            return;
        }

        int count = 0;

        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                if (count > 0) {
                    System.out.print("*");
                }
                System.out.print(i);
                number /= i;
                count++;
            }
        }
        if (number > 1 && count == 0) {
            System.out.println("-1");
        } else if (number > 1) {
            if (count > 0) {
                System.out.print("*");
            }
            System.out.print(number);
            count++;
        } else if (count == 0) {
            System.out.println("-1");
        }
    }
}
