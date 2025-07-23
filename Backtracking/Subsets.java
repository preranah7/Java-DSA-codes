package Backtracking;

public class Subsets {

    public static void findSubsets(String str, String ans, int i){//O(n * 2^n)
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //recursion
        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        findSubsets(str, ans, i+1);
    }

    public static void findPermutation(String str,String ans){ //O(n * n!)
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" -> removing c => "ab"+"de" = "abde"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }

    
    public static void main(String[] args) {
        String str = "abc";
        //findSubsets(str, "", 0);
        //abc ab ac a bc b c null


        findPermutation(str, "");
        // abc
        // acb
        // bac
        // bca
        // cab
        // cba
    }
}