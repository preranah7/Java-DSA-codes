package Tries;

public class ques {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    
    public static boolean search(String key){
        Node curr = root;
        for(int level=0 ; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

  
    //Que1 - Given a string of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string.

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0;i<26;i++){
            if (root.children[i] != null) {
                count+= countNodes(root.children[i]);
            }
        }

        return count+1;
    }



    //Que2 - Find the longest string in words such that every prefix of it is also in words.

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if (root == null) {
            return;
        }

        for(int i=0;i<26;i++){ //apple, apply
            if(root.children[i]!=null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);

                if (temp.length()>ans.length()) {
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }
    //for lexicographically smaller letter-word i.e apple loop from 0 to 26 (ans - apple)
    //for lexicographically larger letter-word i.e apply loop from 25 to 0 - for(int i=25; i>=0; i--) (ans - apply)
    


    public static void main(String[] args) {
        //Que - 1
        String str = "ababa";

        //suffix -> insert in trie
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            //insert(suffix);
        }
        //System.out.println(countNodes(root));//10


        //Que -2
        String words[] = {"a","banana","app","appl","ap","apply","apple"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
