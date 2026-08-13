//Question 2:In a program,input the side of a square.You have to output the area of the square.
//          (Hint : area of a square is (side x side))

import java.util.*;
public class AreaofSquare {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int side = scn.nextInt();

        int Area = side * side;
        System.out.println(Area);

        scn.close();
    }
}
