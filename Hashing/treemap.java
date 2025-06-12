package Hashing;

import java.util.TreeMap;
public class treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer>tm = new TreeMap<>();

        //alphabetically sorted key output
        tm.put("India", 456);
        tm.put("UK", 496);
        tm.put("China", 666);

        System.out.println(tm);

    }
}

//Notes
//- Keys are sorted in tree map
//- put, get, remove are O(logn)
//- Internal implementation using Red Black Trees
