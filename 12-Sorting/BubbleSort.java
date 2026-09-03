import java.util.*;

public class BubbleSort {
 
        
    public stat ic void bubbleS ort(int ar r [ ] ){ 
        for(int tu rn = 0 ; turn <   arr .length-1; turn++){
            for(int j = 0; j <arr.length-1-turn; j++){
                if(arr[j] > arr[j+ 1 ]){
                    int t e mp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
    }  
    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
         
    public static void main(String[] args){
        int arr[] ={6,3,5,2,1,8,9};

        bubbleSort(arr);
        printarr(arr);
    }
}
