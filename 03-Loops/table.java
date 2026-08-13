import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Table number :");
        int n = scn.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
        System.out.println();
        scn.close();
    }
}
