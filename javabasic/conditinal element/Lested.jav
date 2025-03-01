import java.util.Scanner;

public class Lested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close(); // Closing scanner to avoid memory leaks

        if (a >= 60) {
            System.out.println("Old");
        } else if (a >= 30) {
            System.out.println("Young");
        } else if (a >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
    }
}
