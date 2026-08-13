import java.util.*;
    public class fbinomialcoefficient{

        // here we write the function above the main section 

        public static int factorial(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f*i;
        }
        return f;
    }
        
        public static int binfactorial(int n , int r){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);
            int binfactorial = fact_n/(fact_r*fact_nmr); // NcR = n!/r!(n-r)!  This is to finding the BinomialFactorial

            return binfactorial;
        }

        public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number n :");
        int n =scn.nextInt();

        System.out.print("Enter number r :");
        int r =scn.nextInt();

        int f = binfactorial(n,r);
        System.out.println("Binfactorial of given number is :" + f);

        scn.close();
    
    }
    }
