import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number to Find Factorial:-");
        int number = scn.nextInt();

        long factorial = 1;

        for(int i = 1 ; i <= number; i++){
            factorial = factorial*i;
        }

        System.out.println("Factorial of given Number is :" +factorial);

        scn.close();

    }
}
