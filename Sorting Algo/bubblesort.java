package Sorting;

public class bubblesort {

    public static void bubbleSort(int arr[]){
        
        for(int turn=0;turn<arr.length-1;turn++){
            
            for(int j=0;j<arr.length-1-turn;j++)//for(int j=0;j<=arr.length-2-turn;j++)
            {
                if(arr[j]>arr[j+1]){
                    //swap
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
                
            }
        }
        
        System.out.println();
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           
        }
        System.out.println();
    }
        
    
    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
//output -> 1 2 3 4 5 