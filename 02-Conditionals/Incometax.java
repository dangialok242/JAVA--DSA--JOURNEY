import java.util.*;
public class Incometax {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Salary Amount:-");
        Float Salary = scn.nextFloat();
        System.out.println("Income =" +" "+Salary);

        if(Salary<500000){
            float tax = Salary - Salary*0/100;
            System.out.println("Salary With Gst =" +" "+tax);
        }
        else if(Salary <=500000 && Salary <1000000){
            float tax = Salary - Salary*20/100;
            System.out.println("Salary With GST =" +" "+tax);
        }
        else{
            float tax = Salary - Salary*30/100;
            System.out.println("Salary With GST =" +" "+tax);
        }

        scn.close();
    
    }
}
