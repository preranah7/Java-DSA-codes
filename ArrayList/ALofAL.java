package Arraylist;
import java.util.*;
public class ALofAL {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();//mainlist

        //to store a arraylist in main list - create one more arraylist

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i<=5 ; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1); //sublist in mainlist
        mainlist.add(list2); //sublist in mainlist
        mainlist.add(list3); //sublist in mainlist


        System.out.println(mainlist);

        //traverse main list
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currList = mainlist.get(i); //gives the whole sublist at ith index
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
