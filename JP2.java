import java.util.Scanner;
public class JP2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (i%2==0) {
                continue;
            } else {
                count+=i;
            }
        }
        System.out.println(count);
    }
}
