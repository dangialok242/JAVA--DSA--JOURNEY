import java.util.*;

public class Asubarray {

        // Write the code of subarray and add the row of element;
    
    public static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = sum + arr[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("=" + " " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = { 19, 20, 70, 80, 90 };
        subarray(arr);

        scn.close();
    }
}
