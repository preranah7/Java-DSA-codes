package JavaLec3;
import java.util.*;
public class Homework {
    public static void main(String[] args) {
        //How many times 'Hello' is printed?
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            i+=2;

            //output
            //Hello
            //Hello
        }

        
        //Factorial of a positive integer
        Scanner sc = new Scanner(System.in);
        int num;
        int fact =1;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++) {
            fact = fact*i;
        }
        System.out.println("Factorial: "+ fact);
        sc.close();
 
   }

}
