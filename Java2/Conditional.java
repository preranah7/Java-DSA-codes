package JavaLec2;
import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){ //if statement
            System.out.println("You are eligible to vote,and driving lisense");
        }
        
        else if (age>=13 && age<18) { //if first if is satisfied then else if and else is not checked 
            System.out.println("You are a teenager");
        }

        else{ //else condition
            System.out.println("You are not an adult");
        }
        sc.close();
    }
}
//output
// Enter your age
// 16
// You are a teenager