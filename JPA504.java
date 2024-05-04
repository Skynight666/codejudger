import java.util.Scanner;

public class JPA504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("輸入錯誤！請輸入一個正整數。");
        } else {
            if (isPalindrome(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int x = number;
        int y = 0;
        while (number != 0) {
            int z = number % 10;
            y = y * 10 + z;
            number /= 10;
        }
        return x == y;
    }
}
