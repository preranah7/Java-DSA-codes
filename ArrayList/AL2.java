package Arraylist;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class AL2 {

    public static void swap(ArrayList<Integer>list , int idx1 , int idx2){
        System.out.println("list before swapping - "+ list);
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2, temp);
        System.out.print("List after swapping - "+ list);
    }

    public static void max(ArrayList<Integer>list){
        //Print maximum from list - O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            //max = Math.max(max , list.get(i));
        }
        System.out.println("Max element = "+ max);
    }

    public static void sort(ArrayList<Integer>list){
        System.out.println("List before sorting - "+ list);
        Collections.sort(list);
        System.out.println("List after ascending sorting - "+ list);

        //descending order
        Collections.sort(list , Collections.reverseOrder()); //Comparator - fnx logic
        System.out.println("List after descending sorting - "+ list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int idx1 = 1 , idx2 = 3;
        //swap(list, idx1, idx2);
        System.out.println();
        //max(list);

        sort(list);
        
    }
}
