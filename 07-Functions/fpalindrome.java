import java.util.*;

public class fpalindrome {

    public static boolean palindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scn.nextInt();

        if (palindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scn.close();
    }
}