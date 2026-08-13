import java.util.*;
public class multipleofN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number:");
        int N =  scn.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scn.close();
    }
}
