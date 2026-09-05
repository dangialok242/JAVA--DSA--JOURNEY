import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void Printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer arr[] = {2, 5, 3, 6, 3, 7, 1};

            // for Ascending Order Sort

        //Arrays.sort(arr);

            // for Descending order Sort
        Arrays.sort(arr,Collections.reverseOrder());
        
        Printarr(arr);
    }
}