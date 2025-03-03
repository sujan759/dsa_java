package javabasic.loops;

import java.util.Scanner;

public class sumnaturaln {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in natural number range");

        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n) {
            // System.out.println("Hello sujan");
            System.out.println();
            sum +=i;
            i ++;
        }
        System.out.println(sum);
    }
}
