//Input in Java
import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //sc can be any object name.Create a scanner object to take input
        String input = sc.next();//next() will not store the input after a space
        System.out.println(input);

        String name = sc.nextLine();//stores the spaces 
        System.out.println(name);

        int number = sc.nextInt();//digit input
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        sc.close();

    }
}
