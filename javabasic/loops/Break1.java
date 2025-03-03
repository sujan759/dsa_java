package javabasic.loops;

import java.util.*;
public class Break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop breaks at: " + i);
                break;  // Exits the loop when i == 5
            }
            System.out.println(i);
        }
    }
}
