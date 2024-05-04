import java.util.Scanner;

public class JPA406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() > 50) {
            scanner.close();
            return;
        }

        String rows = "qwertyuiopQWERTYUIOPasdfghjklASDFGHJKLzxcvbnmZXCVBNM";
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            int index = rows.indexOf(c);
            if (index != -1 && !isEndOfRow(c)) {
                output.append(rows.charAt(index + 1));
            } else {
                output.append(c);
            }
        }

        System.out.println(output);
        scanner.close();
    }

    private static boolean isEndOfRow(char c) {
        return "pP".indexOf(c) >= 0 || "lL".indexOf(c) >= 0 || "mM".indexOf(c) >= 0;
    }
}
