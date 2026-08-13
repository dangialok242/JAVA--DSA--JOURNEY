// Question1:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
//           (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;
public class averagenumber {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        float a = 5;
        float b = 10;
        float c = 20;

        float avg = (a+b+c)/3;

        System.out.println(avg);

        scn.close();
        
    }
}
