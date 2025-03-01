import java.util.Scanner;

public class PrintLargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("print a is large");
        } else {
            System.out.println("print b is large");
        }
    }
}
