package Arraylist;
import java.util.*;
public class PairSum1 {

    public static boolean pairSum1(ArrayList<Integer>list, int target){//brute force
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }


    //2pointer approach
    public static boolean pairSumII(ArrayList<Integer>list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while(lp!=rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                //case 3
                rp--;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;

        System.out.println(pairSumII(list, target));
    }
}
