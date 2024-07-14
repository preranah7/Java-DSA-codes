package DSAarray;

public class MaxSubarraySum1 {
         //Brute Force Solution
        public static void maxSubarraySum(int numbers[]){
            int curSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                int start = i;
                for(int j=i;j<numbers.length;j++){
                    int end = j;
                    curSum = 0;
                    for(int k=start;k<=end;k++){
                      //subarray sum
                      curSum += numbers[k];
                    }
                    System.out.println(curSum);
                    if (maxSum<curSum) {
                        maxSum = curSum;
                    }
    
                }
    
            }
            System.out.println("Maximum sum "+ maxSum );
        }
        public static void main(String[] args) {
            int numbers[]={2,4,6,8,10};
            maxSubarraySum(numbers);
        }
    }
     //Time Complexity O(n(cube)) Bad Time Complexity
    //output
    // 2
    // 6
    // 12
    // 20
    // 30
    // 4
    // 10
    // 18
    // 28
    // 6
    // 14
    // 24
    // 8
    // 18
    // 10
    // 14
    // 24
    // 8
    // 18
    // 10
    // 18
    // 10
    // 10
    // Maximum sum30

