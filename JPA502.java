import java.util.Scanner;

public class JPA502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        scanner.close();

        if (input < 0) {
            return;
        }

        String inputStr = Long.toString(input);
        int length = inputStr.length();
        if (length > 9) {
            return;
        }

        long result = 1;
        StringBuilder equation = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = inputStr.charAt(i) - '0';
            result *= digit;
            if (i == 0) {
                equation.append(digit);
            } else {
                equation.append("*").append(digit);
            }
        }

        equation.append("=").append(result);
        System.out.println(equation.toString());
    }
}
