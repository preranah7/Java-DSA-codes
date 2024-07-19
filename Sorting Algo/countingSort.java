package Sorting;

public class countingSort {

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];//+1 because we start from 0
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }//frequency counting, iterating on original array

        //sorting, iterating on frequency array
        int j=0;//start index form 0 in original array
        for(int i=0;i<count.length;i++){
            while(count[i]>0){ // till the value of count is not zero
                arr[j] = i; //number is getting placed in original array
                j++;//increasing index
                count[i]--;//once the count is noted it gets decreased(imagine the number is apperaing 2 times)

            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printArr(arr);

    }
}
//output  1 1 2 3 3 4 4 7
//count sort is used for positive numbers in most of the cases. It should be used where the given range(value) is small though quantity can be maximum