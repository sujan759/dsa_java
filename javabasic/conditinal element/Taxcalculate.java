import java.util.Scanner;

public class Taxcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        if (18 <= a) {
            System.out.println("Adult");
        } 
        else if(30<=a) {
            System.out.println("Yeng");
        }
        
        else if (60<=a){
            System.out.println("old");

        }
        else{
            System.out.println("child");

        }
    }
}
