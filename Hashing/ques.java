package Hashing;

import java.util.*;

public class ques {

    //Que - Given an integer array of size n,find all elements that appear more than [n/3] times.

    //nums[] = {1,3,2,5,1,3,1,5,1}; output-1
    //nums[] = {1,2}; output-1,2

    public static void majorityElement(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){//O(n)
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }

            //shorthand for above if-else
            // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){//for (Integer key : map.keySet())
            if (map.get(key)>arr.length/3) {
                System.out.println(key);//1
            }
        }
    }


    //Que - Given two strings s and t, return true if t is an anagram of s, and false otherwise

    public static boolean isAnagram(String s, String t){ //O(n)
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch)==1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch)-1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }


    //Count Distinct Elements
    public static int distinctCount(int nums[]){
        HashSet<Integer> set = new HashSet<>();

        for(Integer i:nums){//O(n)
            set.add(i);
        }

        return set.size();
    }


    //que - find union and intersection of two arrays
    public static void unionAndIntersect(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(Integer i:arr1){
            set.add(i);
        }
        for(Integer j:arr2){
            set.add(j);
        }
        System.out.println("Union - "+set.size());
        System.out.println("Union set - "+set);

        set.clear();
        for(Integer i:arr1){
            set.add(i);
        }

        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if (set.contains(arr2[i])) {
                count++;
                al.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection - "+ count);
        System.out.println("Intersection - "+ al);
    }


    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        //majorityElement(arr);

        String s = "race";
        String t = "care";
        //System.out.println(isAnagram(s, t));

        int nums[] = {4,3,2,5,6,7,3,4,2,1};
       // System.out.println(distinctCount(nums));


       int arr1[] = {7,3,9};
       int arr2[] = {6,3,9,2,9,4};
       unionAndIntersect(arr1, arr2);


    }
}