package Arraylist;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //syntax - ArrayList<inbuilt data type(Integer | String | Boolean)>ArrayList name = new ArrayList<>();

        //similar to ClassName objectName = new ClassName();

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<Boolean> list3 = new ArrayList<>();
        
        //ADD operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        //or

        //list.add(indexno , element); - O(n)
        list.add(1 , 9);
        System.out.println(list);
        System.out.println("size is" + list.size()); //method to find size/length of arraylist
        
 
        //first element is always stored at 0th index and last element is stored at list.size()-1


        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //Print Reverse of an ArrayList - O(n)
        for(int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();



        //GET operation - index passed as parameter - O(1)
        int element = list.get(2);
        System.out.println(element);


        //REMOVE operation - index passed as parameter - O(n)
        list.remove(2);
        System.out.println(list);


        //Set Element at Index operation - listname.set(indexno,element); - O(n)
        list.set(2,10);
        System.out.println(list);

        
        //Contains Element operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
