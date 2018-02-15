package week1;

import java.util.Scanner;

/**
 * Created by diana.kave on 2/15/2018.
 */
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; //declare variable
        int oddNumbers = 0; //nechetnie
        int evenNumbers = 0; //chetnie

        do {
            System.out.print("Enter an integer value or 0 to stop: ");
            n = scanner.nextInt();
            if (n != 0) {
                System.out.println("Your number is " + n); //if user enters a value <>0, system prints out the entered number
            }

            if (n%2==0 && n!=0) // identify whether a number is even or odd, excluding zero
            {
                evenNumbers++; // ++ increments counter to +1, just adds one to even numbers
            }
            else
            {
                oddNumbers++; // ++ increments counter to +1, just adds one to odd numbers
            }

        } while (n != 0); //Finish loop, once zero is entered



        System.out.println("Have a nice day!" );
        System.out.println("Number of even numbers: "+evenNumbers);
        System.out.println("Number of odd numbers: "+oddNumbers);
    }
}

