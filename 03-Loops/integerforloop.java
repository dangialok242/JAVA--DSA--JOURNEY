import java.util.*;
public class integerforloop {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = 10899;

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);

            n = n/10;

        }

        System.out.println();

        scn.close();

    }
}
