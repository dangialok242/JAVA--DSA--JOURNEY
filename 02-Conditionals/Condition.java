import java.util.*;
public class Condition {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Age is:");
        float age = scn.nextFloat();

        // Check Condition next.

        if(age >=18){
            System.out.print("You Are Eligible for voting and Driving\n");
        }
        else{
            System.out.print("You Are Not Eligible for voting and Driving\n");

        }
        
        scn.close();
    }
}
