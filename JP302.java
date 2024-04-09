import java.util.Scanner;
public class JP302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            numbers[i] = num;
        }
        System.out.print(compute(numbers));
    }
    public static int compute(int num[]) {
        Scanner sca = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (num[i]%3==0) {
                count+=1;
            }
        }
        return count;
    }
}
