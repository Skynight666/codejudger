import java.util.Scanner;

public class JPA602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder upperCaseString = new StringBuilder();
        StringBuilder lowerCaseString = new StringBuilder();
        int upperCaseCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseString.append(ch);
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseString.append(ch);
            }
        }
        System.out.println(upperCaseString.toString());
        System.out.println(lowerCaseString.toString());
        System.out.println(upperCaseCount);
        scanner.close();
    }
}
