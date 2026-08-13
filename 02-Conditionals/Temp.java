import java.util.*;
public class Temp {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Take temperature :");
        double Temp = scn.nextDouble();

        if(Temp>100){
            System.out.println("You are suffring from fever ");
        }
        else{
            System.out.println("You are not suffring from fever ");
        }
        scn.close();

    }
}
