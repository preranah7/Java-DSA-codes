package Heaps;

import java.util.PriorityQueue;

//Sliding Window Maximum

public class SDmax {

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //descending
            return p2.val - this.val;
        }

    }
    public static void main(String[] args) { //O(nlogk)
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3; //Window size
        int res[] = new int[arr.length-k+1];//n-k+1


        PriorityQueue<Pair>pq = new PriorityQueue<>();


        //step1 - store first window elements
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        //step2 - 
        for(int i=k; i<arr.length; i++){
            while(pq.size()>0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val; //i=k therefore i-k = 0 and i-k+1 = 1, i.e res[1]
            //then as i val will increase it will become res[2] and so on
        }

        //print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

        //3 3 5 5 6 7 

    }
}
