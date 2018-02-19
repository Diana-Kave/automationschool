package week1;


/**
 * Created by diana.kave on 2/19/2018.
 */

import java.lang.Math;
import java.util.Scanner;
public class ProgramCalculation {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please input 3 integer numbers, each number should be entered on the next line : ");
            int a = Integer.parseInt(keyboard.nextLine()); //declare 1st variable
            int b = Integer.parseInt(keyboard.nextLine()); //declare 2nd variable
            int c = Integer.parseInt(keyboard.nextLine()); //declare 3rd variable
            int max = Math.max(a,b ); // declare 4th variable = maximum (1st and 2nd variables)
            if(max>b ){ //assume that a is maximum comparing a with c to find a maximum value
                max = Math.max(a,c );
            }
            else{ //if b is max then compare b with c to find a maximum value
                max = Math.max(b ,c );
            }
            System.out.println("Maximum of 3 is: " + max);
        }
    }

