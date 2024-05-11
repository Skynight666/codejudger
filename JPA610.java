import java.util.Scanner;

public class JPA610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix1 = inputMatrix(a, b, scanner);

        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] matrix2 = inputMatrix(c, d, scanner);

        if (b != c) {
            System.out.println("error");
        } else {
            int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
            printMatrix(resultMatrix);
        }

        scanner.close();
    }

    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int a = matrix1.length;
        int b = matrix1[0].length;
        int c = matrix2.length;
        int d = matrix2[0].length;
        int[][] resultMatrix = new int[a][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < b; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
                if (j < cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
