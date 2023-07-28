package ke.co.skwaweru254;

//reverse number  using while loop
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number:: ");
        int number = obj.nextInt(), reversed = 0;

        System.out.println("Original number:" + number);

        while (number != 0) {

            int last = number % 10;

            reversed = reversed * 10 + last;

            number /= 10;

        }

        System.out.println("Reversed number:" + reversed);


    }
}
