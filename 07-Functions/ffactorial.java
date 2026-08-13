import java.util.*;
public class ffactorial {
    
    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number:");
        int l =scn.nextInt();
        int f = factorial(l);

        System.out.println("Factorial of Given Number:" +f);

        scn.close();
    
    }
}
