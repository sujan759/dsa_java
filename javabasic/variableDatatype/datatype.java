package javabasic.variableDatatype;
// 1. Primitive Data Types (Built-in)
// These are the basic data types provided by Java:

// Data Type	Size	Default Value	Description
// byte	      1 byte	0	Stores small integers (-128 to 127)
// short	  2 bytes	0	Stores larger integers (-32,768 to 32,767)
// int	      4 bytes	0	Stores whole numbers (-2³¹ to 2³¹-1)
// long	      8 bytes	0L	Stores very large numbers (-2⁶³ to 2⁶³-1)
// float	  4 bytes	0.0f	Stores decimal numbers (single precision)
// double	  8 bytes	0.0d	Stores decimal numbers (double precision)
// char	      2 bytes	'\u0000'	Stores a single character (Unicode)
// boolean 	  1 bit	false	Stores true or false values

// 2. Non-Primitive Data Types (Reference Types)
// These are user-defined or complex types:

// String (e.g., "Hello"): A sequence of characters.
// Arrays (e.g., int[] arr = {1, 2, 3};): Collection of similar types.
// Classes (e.g., class Student {}): Blueprint for objects.
// Interfaces (e.g., interface Vehicle {}): Defines behavior for classes.
// Enums (e.g., enum Days { MON, TUE, WED }): Constants.

public class datatype {
    public static void main(String[] args) {
        byte b= 8;
        System.out.println(b);
        char ch= 'a';  //carecter store
        System.out.println(ch);
        boolean var=false;
        System.out.println(var);

        int n=6877878;
        System.out.println(n);
        
        long d=255877714;
        System.out.println(d);
        double a=440.4;
        System.out.println(a);
        short ed=546;
        System.out.println(ed);

    }
}
