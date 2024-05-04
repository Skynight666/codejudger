import java.io.*;
import java.util.Scanner;

public class JPA410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try {
            File inputFile = new File("read.txt");
            File outputFile = new File("write.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int count = 0;
            while ((line = reader.readLine()) != null && count < n) {
                String capitalizedLine = capitalizeLine(line);
                writer.write(capitalizedLine);
                writer.newLine();
                count++;
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("讀取或寫入時出錯: " + e.getMessage());
        }
        scanner.close();
    }
    private static String capitalizeLine(String line) {
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
}
