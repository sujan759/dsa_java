import java.util.Scanner;

public class Printlarg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:\n");

        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if ((a>b) && (a>c)) {
            System.out.println("a is gretrer thane all:"+ a);
        }
        else if (b>c) {
            System.out.println("b is gretrer thane all:"+ b);

        }
        else if((a==b)&&(b==c)){
            System.out.println(" all are equal:");

        }
        else{
            System.out.println("c is gretrer thane all:"+ c);

        }



    }
}

