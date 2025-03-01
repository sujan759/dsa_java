import java.util.Scanner;

public class Taxcalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.close(); // Closing scanner to avoid memory leaks
        System.out.println("Enter your Income: " + income);
        int Tax;
        if (income <500000) {
            Tax = 0;
        } 
        else if (income>= 500000 && income<1000000) {
            Tax=(int) (income*0.2);
        } 
        else {
            Tax=(int) (income*0.3);
        }
        System.out.println(" your Income total with Tax: " + Tax);

    }
}
