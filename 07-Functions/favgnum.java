import java.util.*;
public class favgnum {

    public static int avg(int m, int n, int o){
        int avg = (m+n+o)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int n = scn.nextInt();

        System.out.print("Enter Second Number:");
        int m = scn.nextInt();

        System.out.print("Enter Third Number:");
        int o = scn.nextInt();

        System.out.println(avg(n,m,o));

        scn.close();
    }
}