// Type Casting / narroing/ explicty



package javabasic.variableDatatype;

import java.util.Scanner;

public class Type_Csting {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        // int num=sc.nextFloat();  thats it will be note store in int to float
        float num4=sc.nextFloat();// float store int value
        // float num=454.5f;
        int num1=(int)num4;
        System.out.println(num1);
        char chr='a';
        int nu=(int)chr;
        System.out.println(nu);

    }
}
