package Recursion;
public class Recursion2 {

    public static int tilingProblem(int n){//2 * n(floor size)

    //question - Given a 2 * n board and tiles of size "2 * 1", count the number of ways to tile the given board using the 2 * 1 tiles.(A tile can either be placed horizontally or vertically)

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProblem(n-1);
 
        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;

    }


    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        //ques - remove duplicates in a string(string can contain a-z)

        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


    

    public static int friendsPairing(int n){
        
        //ques - Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can bepaired up

        //base case
        if(n == 1 || n == 2){
            return n;
        }

        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;

        return totalWays;


       // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2); same function in single line

    }


    public static void printBinStrings(int n, int lastPlace, String str){

        //question - binary strings problem
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0){
        //     //sit 0 on chair n 
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // } else {
        //     printBinStrings(n-1, 0, str.append("0"));
        // }

        printBinStrings(n-1, 0, str+"0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str+"1");
        }
    }


    public static void main(String[] args) {
       // System.out.println(tilingProblem(4));

       //String str = "appnnacollege";
       //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

       //System.out.println(friendsPairing(3));

       printBinStrings(3, 0, "");

    }
}