package DSAarray;

public class MaxSubarraySum2 { //prefix method
    public static void maxSubarraySum(int numbers[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){//loop started with 1 because on 0th index sum is eqaul to the number present on that 0th index
            prefix[i] = prefix[i-1] + numbers[i];

        }

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                //System.out.println(curSum);
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
