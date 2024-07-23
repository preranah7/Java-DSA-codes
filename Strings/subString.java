package Strings;

public class subString {

    public static String substring(String s , int si , int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += s.charAt(i);
        }
        return substr; 
        //output Hello
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.substring(0,5)); //hello
        System.out.println(substring(s,0,5));
      
    }
    
}
