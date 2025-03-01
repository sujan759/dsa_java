// package javabasic.conditinal element;
import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int age=sc.nextInt();
        if(age>=18) {
            System.out.println("adult, vote,drive ");
        }
        else{
            System.out.println("childe ");

        }
    }
}
