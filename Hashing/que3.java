package Hashing;

import java.util.*;

public class que3 {

    //Que - Length of Largest Subarray with sum 0
    public static int SAsum0(int arr[]){//O(n)
        HashMap<Integer , Integer> map = new HashMap<>();//(sum,idx)

        int sum = 0;
        int len = 0;

        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len,j-map.get(sum));
            } else {
                map.put(sum, j);
            }
        }

        return len;
    }


    //que - count of subarray sum equal to k
    public static int SAsumK(int arr1[],int k){//O(n)
        HashMap<Integer,Integer>map = new HashMap<>();//(sum,count)
        map.put(0, 1);//necessary step
        int sum = 0;
        int ans = 0;

        for(int j=0;j<arr1.length;j++){
            sum+=arr1[j];
            if (map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};

        //System.out.println("Largest SubArray Sum Length with sum 0 -> "+SAsum0(arr));

        int arr1[] = {10,2,-2,-20,10};
        int k = -10; 
        System.out.println(SAsumK(arr1, k));//3

    }
}
