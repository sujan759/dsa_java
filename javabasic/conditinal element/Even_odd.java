import java.util.Scanner;

public class Even_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        if (a%2==0) {
            System.out.println("print a  is even");
        } else {
            System.out.println("print b is Odd");
        }
    }
}
