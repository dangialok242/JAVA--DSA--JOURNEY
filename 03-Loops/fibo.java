import java.util.*;
public class fibo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number:");
        int n = scn.nextInt();

        int previous = 0;
        int current  = 1;

        System.out.print("Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(previous + " ");
            int next = previous + current;
            previous = current;
            current = next;
        }

        scn.close();
    }
}
