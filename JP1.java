import java.util.Scanner;
public class JP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<0||n>100){
            System.out.println("error");
        } else if (n>60) {
            System.out.println(n+10);
        } else {
            System.out.println(n+5);
        }
    }
}
