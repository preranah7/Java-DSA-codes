package DSAarray;

public class KadaneAlgo {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE; //maximum sum
        int cs = 0; //current sum
        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i]; 
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println("Maximum subArray sum is "+ ms);

    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
//Time Complexity -> O(n)
//for all -ve numbers in an array we have to return the smallest -ve number
// which is not covered here