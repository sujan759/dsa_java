/*  Type Conversion / widening/ omplicit
 Conversion happens when 
 a.type compatible 
 b. destination type>source type

 byte->short->int->float->long->double

*/
package javabasic.variableDatatype;

import java.util.Scanner;

public class TypeConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int num=sc.nextFloat();  thats it will be note store in int to float
        float num=sc.nextInt();// float store int value
        System.out.println(num);
    }
}
