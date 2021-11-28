package week2;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt();
        // num = num < 0 ? -num : num;
        if (num < 0) {
            num = -num ;
        } ;
        int a = num%6+2;
        System.out.println(a);

    }


}
