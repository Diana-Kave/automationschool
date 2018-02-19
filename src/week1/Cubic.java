package week1;

import java.util.Scanner;

/**
 * Created by diana.kave on 2/15/2018.
 */

public class Cubic {

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
        {
            System.out.print("Entered number " + num + " is cubic.");
        }
        else
        {
            System.out.print("Entered number " + num + " is not cubic.");
        }
        System.out.println("\n");
    }
}
