import java.util.Arrays;
import java.util.Scanner;

public class JPA604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
            sum +=numbers[i];
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number);
            System.out.println();
        }
        System.out.println("sum = "+sum);
        scanner.close();
    }
}
