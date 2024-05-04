import java.util.Scanner;
public class JPA208 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        for (int i = 2; i < n1; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0) {
                    if (i==j){
                        System.out.print(i+" ");
                    } else {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
