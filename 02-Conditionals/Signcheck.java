import java.util.*;
public class Signcheck {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("Choose Number :-");

        int number = scn.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
        scn.close();
    }
}
