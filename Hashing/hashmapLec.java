package Hashing;
import java.util.HashMap;
import java.util.Set;
public class hashmapLec {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 500);
        hm.put("Nepal", 420);
        hm.put("Australia", 230);

        //Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);//[China, Australia, US, Nepal, India]

        for (String k : keys) {
            System.out.println("key = "+k+",value = "+hm.get(k));
        }



        //print
        System.out.println(hm);//{China=150, US=50, India=100}



        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        
        System.out.println(hm.get("Goa"));//null



        //containsKey - O(1) boolean
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Goa")); //false



        //Remove - O(1) removes and returns value
        System.out.println(hm.remove("China"));//150
        System.out.println(hm.remove("Goa"));//null


        
        //Size
        System.out.println(hm.size());


        //isEmpty - boolean
        System.out.println(hm.isEmpty());


        //clear - map is cleared
        hm.clear();
        System.out.println(hm.isEmpty());//true

    }
}

//Notes
// - In java hashmaps are unordered maps
// - In get function if key passed which is not defined already then it will return null value
// hm.entrySet(); //gives pairs set
