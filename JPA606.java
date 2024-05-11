import java.util.Scanner;

public class JPA606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String studentID = scanner.next();
            if (isValidStudentID(studentID)) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }

    public static boolean isValidStudentID(String studentID) {
        int s0 = studentID.charAt(0) - '0';
        int s1 = studentID.charAt(1) - '0';
        int s2 = studentID.charAt(2) - '0';
        int s3 = studentID.charAt(3) - '0';
        int s4 = studentID.charAt(4) - '0';


        int s5Value = ((s0 + s2 + s4) + (s1 + s3) * 5) % 26;
        char expectedS5 = (char) ('A' + s5Value - 1);

        return studentID.charAt(5) == expectedS5;
    }
}
