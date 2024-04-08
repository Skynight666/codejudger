import java.util.Scanner;
public class JP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        String x = scn.next();
        if (x.equals("+")) {
            System.out.println(n1 + x + n2 +"=" + (n1+n2));
        } else if (x.equals("-")) {
            System.out.println(n1 + x + n2 +"=" + (n1-n2));
        } else if (x.equals("*")) {
            System.out.println(n1 + x + n2 +"=" + (n1*n2));
        } else {
            System.out.println("error");
        }
    }
}
