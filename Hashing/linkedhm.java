package Hashing;

import java.util.LinkedHashMap;

public class linkedhm {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}

//Notes
// - LinkedHashMap maintains the insertion order
// - Internally doubly linked list is used for implementation