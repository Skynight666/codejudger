import java.util.Scanner;

public class JPA404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() > 50 || !input.matches("[a-z]+")) {
            scanner.close();
            return;
        }

        int[] counts = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            counts[c - 'a']++;
        }

        int maxCount = 0;
        char mostFrequent = 'a';
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostFrequent = (char) (i + 'a');
            }
        }

        System.out.println(mostFrequent);
        System.out.println(maxCount);
        scanner.close();
    }
}
