package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {

    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 5,4,1,2,3 };//for ascending order int arr[]
        //for sorted array in ascending order
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        //for sorted array in descending order
        Arrays.sort(arr,Collections.reverseOrder());//reverse order functions always are work on objects hence changes needed in int to Integer only for reverse order function
        //Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);


    }
}
//output of Arrays.sort(arr); --> 1 2 3 4 5 
//time complexity O(n logn)
//output of  Arrays.sort(arr,0,3); --> 1 4 5 2 3
//outpt of Arrays.sort(arr,Collections.reverseOrder()); --> 5 4 3 2 1
//output of Arrays.sort(arr,0,3,Collections.reverseOrder()); --> 5 4 1 3 2