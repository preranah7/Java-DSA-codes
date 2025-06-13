package Hashing;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(4);

        System.out.println(set);//[1, 2, 3, 4, 5]
 
        set.remove(2);
        if (set.contains(2)) {
            System.out.println("contains 2");
        } else {
            System.out.println("not contains 2");
        }

        System.out.println(set.size());
        
        set.clear();
        System.out.println(set.size());

        System.out.println(set.isEmpty());


        HashSet<String>cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bangalore");

        //hashset iterator
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //for each loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
//Notes
// - hashsets store unique values
// - internally hash set is implemented using hashmaps in java , values are dummy in key-value pairs
// - no duplicates present in hash set
// - NULL is allowed
// - hashsets are unordered
// - iterators in hashset --> TC - O(n)
