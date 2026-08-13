import java.util.*;
public class sumwhile {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number:"+" " );
        int range= scn.nextInt();

         int counter = 1;
        while(counter<range){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println(counter);

        int sum = 0;
        int i = 1;
        while(i<=range){
            sum += i;
            i++;
        }

        System.out.println("Sum :" +" " + sum);

        scn.close();

    }
}
