import java.util.*;

public class fevenodd {

    public static int evenodd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number:");
        int n = scn.nextInt();

        evenodd(n);

        scn.close();
    }
}
