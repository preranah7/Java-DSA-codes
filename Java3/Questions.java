package JavaLec3;
//import java.util.*;
public class Questions {
    public static void main(String[] args) {
        //Print reverse of number
        int n =10899;
        while(n>0){
        int LastDigit = n % 10;
        System.out.print(LastDigit);
        n = n/10; //n/=10
        }

        //Reverse the given number
        int m = 10899;
        int rev = 0;
        while(m>0){
          int lastDigit = m % 10;
          rev = (rev * 10) + lastDigit;
          m = m/10;
          }
          System.out.println(rev);

    }
}

