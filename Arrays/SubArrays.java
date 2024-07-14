package DSAarray;
public class SubArrays {
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                   System.out.println(numbers[k]+" ");
                } 
                ts++;//Total Sub Arrays
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);

    }
}

// output
// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

// Total Sub Arrays: 15

// total sub arrays = (n(n+1))/2
// in this case n = 5(size of array)