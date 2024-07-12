package DSAarray;
//import java.util.*;
//Largest & smallest number in array
public class LargestSmallest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){// number on ith index
                largest = numbers[i];

            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
      }
      System.out.println("smallest value is " + smallest);
      return largest;
}
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,6,5};
        System.out.println("Largest number is "+getLargest(numbers));
    }
}
//Time complexity -> O(n)


