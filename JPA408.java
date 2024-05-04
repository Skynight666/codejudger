import java.util.Scanner;

public class JPA408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length()<=3||a.length()>20||b.length()<=3||b.length()>20){
            System.out.println("error");
        }else{
            System.out.println(a.length());
            System.out.println(b.length());
            String n = a+b;
            String nv = new StringBuilder(n).reverse().toString();
            System.out.println(nv);
        }
    }
}
