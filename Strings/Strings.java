package Strings;

//Strings are immutable in java
public class Strings {


    public static boolean isPalindrome(String check_palindrome){
        for(int i=0;i<=check_palindrome.length()/2;i++){
            int n = check_palindrome.length();
            if(check_palindrome.charAt(i) != check_palindrome.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
        //Time complexity - O(n)
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("xyz@#1234");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "prerana hippargi";
        // System.out.println(fullName.length());//output 16

        //concatenation
        // String firstName = "prerana";
        // String lastName = "hippargi";
        // String fullName = firstName + " " + lastName;
        //charAt
        // System.out.println(fullName.charAt(0));
        
        String check_palindrome = "racecar";
        System.out.println(isPalindrome(check_palindrome));


    }
}
