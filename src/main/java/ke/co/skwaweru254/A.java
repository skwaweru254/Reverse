package ke.co.skwaweru254;

//reverse using for loop

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number:: ");
        int number = obj.nextInt(), reversed = 0;

        System.out.println("Original number:" + number);

        for (;number != 0; number = number / 10){

            int last = number % 10;

            reversed = reversed * 10 + last;
        }

        System.out.println("Reversed number:"+reversed);
    }

}
