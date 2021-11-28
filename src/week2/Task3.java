package week2;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble() ;
        float PI = 3.14159f;
        double w = 2 * PI * r ;
        double w2 = PI * Math.pow (r, 2) ;
       System.out.println("paragic " + w +  "  makeres " + w2);


    }
}
