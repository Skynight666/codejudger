import java.util.Scanner;

public class JPA510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (x(matrix, i, j)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    private static boolean x(int[][] matrix, int i, int j) {
        if (matrix[i][j] == 1) {
            if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[0].length - 1) {
                return true;
            }
            if ((i > 0 && matrix[i - 1][j] == 0) ||
                (i < matrix.length - 1 && matrix[i + 1][j] == 0) ||
                (j > 0 && matrix[i][j - 1] == 0) ||
                (j < matrix[0].length - 1 && matrix[i][j + 1] == 0)) {
                return true;
            }
        }
        return false;
    }
}
