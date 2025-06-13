package Hashing;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedhs {
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new 
        LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bangaluru");
        lhs.add("Pune");
        lhs.add("Mumbai");

        lhs.remove("Mumbai");


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Bangaluru");
        ts.add("Pune");
        ts.add("Mumbai");

        ts.remove("Mumbai");


    }
    
}

//Notes
// - TC(Linked Hash Set) - O(1)
// - Ordered using doubly linked list
// - linked hash map is used to implement liked hash set
// performance - LHM < HM
// performance - LHS < HS


// - TreeSet is sorted in ascending order
// - NULL values are not allowed in TreeSet
// - TreeSet are internally implemented in the form of treemap
//TreeSet --> TC - O(logn)


//NULL is only allowed in HashSet and LinkedHashSet
