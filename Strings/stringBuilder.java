package Strings;

public class stringBuilder {

    public static String toUpperCase(String str){
        StringBuilder sbuilder = new StringBuilder("");

        char chr = Character.toUpperCase(str.charAt(0));
        sbuilder.append(chr);
        for(int i=1;i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sbuilder.append(str.charAt(i));
                i++;
                sbuilder.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sbuilder.append(str.charAt(i));
            }
        }
        return sbuilder.toString();
        //output Hi , I Am Prerana
        //time complexity - O(n)
    }
    
    
    
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z' ; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        //output abcdefghijklmnopqrstuvwxyz
        //Time Complexity - O(26)

        String str = "hi , i am prerana";
        System.out.println(toUpperCase(str));
    }
}
