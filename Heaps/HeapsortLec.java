package Heaps;

public class HeapsortLec {

    public static void heapify(int arr[],int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){ //O(nlogn)
        //step1 - build maxHeap
        int n = arr.length;
        for(int i=n/2 ; i>=0 ; i--){ //TC for heapSort - O(n/2*logn) -> O(nlogn)
            heapify(arr,i,n);//TC for heapify O(logn)
        }//O(nlogn)

        //step2 - push largest at end
        for(int i=n-1;i>0;i--){ //O(n)
            
            //swap(largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i); // O(logn)
        } //TC of this loop - O(nlogn)


        //O(nlogn + nlogn) => O(2nlogn) => O(nlogn)

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        //print
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        //1
        //2
        //3
        //4
        //5
    }
}