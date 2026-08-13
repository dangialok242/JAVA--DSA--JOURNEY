import java.util.*;
public class pattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter line of star:");
        int i = scn.nextInt();
        
        // * 
        // * * 
        // * * * 
        // * * * * 

        for (int line =1; line <= i; line++){
            for(int Star =1; Star<=line; Star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // * * * * 
        // * * * 
        // * * 
        // * 

        for (int line =1; line <= i; line++){
            for(int Star =1; Star<=i-line+1; Star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        scn.close();
    }
}
