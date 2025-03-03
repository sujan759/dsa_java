package javabasic.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int range=sc.nextInt();
        int counter=0;
        while (counter<=range) {
            // System.out.println("Hello sujan");
            System.out.println(counter);

            counter ++;
        }
        System.out.println(" all are print sucsees");
        // while (counter<=16) {
        //     // System.out.println("Hello sujan");
        //     System.out.println(counter);

        //     counter ++;
        // }
        // System.out.println(" all are print sucsees");

    }
}
