package Sorting;

public class insertionSort {

    public static void insertionsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int previous = i-1;
            //finding out the correct position
            while(previous >= 0 && arr[previous]>curr){//arr[previous] < curr => for descending order
                arr[previous+1] = arr[previous];
                previous--;

            }
            //insertion
            arr[previous+1] = curr;

        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printArr(arr);

    }
}
//Time Complexity is O(n square)