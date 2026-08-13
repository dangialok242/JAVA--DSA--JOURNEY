import java.util.*;

public class fprime {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scn.nextInt();

        System.out.println(isPrime(n));

        scn.close();
    }
}