import java.util.Scanner;
public class JPA302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(compute(n));
    }
    public static int compute(int a) {
        if (a>=60&&a<=100) {
            return (a+5);
        } else if (a>=0&&a<60){
            return (a+10);
        } else {
            return -1;
        }
    }
}
