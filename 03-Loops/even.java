import java.util.*;
public class even {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number:");
        int n = scn.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");

            if(i % 2 == 0){                
                count++;
            }
        }
        System.out.println();
        System.out.print("Total even number:");
        System.out.println(count);

        scn.close();
    }
}
