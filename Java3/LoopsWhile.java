package JavaLec3;
import java.util.*;
public class LoopsWhile {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 5){
            System.out.println("Hello World");
            counter++;
        }

        //Print numbers from one to 10
        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }

        //print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
        sc.close();

        //print sum of first natural numbers
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m = s.nextInt();
        int sum = 0;
        int j = 1;
        while(j <= m){
            sum = sum + j;
            j++;
        }
        s.close();
    }
}
//while(true) for a satisfactory condition is a infinite loop 
