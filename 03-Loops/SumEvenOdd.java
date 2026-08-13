import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = scn.nextInt();

        int evenSum = 0;
        int oddSum = 0;
       
        
        for(int i = 1; i <= n; i++){
            System.out.print(i + " " );

            if(i%2==0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }

        int sum = 0;
        int i = 1;
        
        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println();
        System.out.println("Sum :" + sum);
        System.out.println("Sum of Even Number :" + evenSum);
        System.out.println("Sum of Odd Number :" + oddSum);
        


        scn.close();
    }
}
