package JavaLec2;
import java.util.*;
public class Questions {
    //Functions concept not done yet hence no functions created.
    public static void main(String[] args) {
        //Print the largest of 2
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if (num1>=num2) {
            System.out.println("largest number is "+num1);
        } else {
            System.out.println("largest number is "+num2);
        }
        
        //question 2
        //Print if number is odd or even
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        
        //question 3 
        //IncomeTax Calculator
        System.out.println("Enter your income");
        int income = sc.nextInt();

        if(income<500000){
            System.out.println("Income tax is 0");
            System.out.println("You have no tax to pay");
        }else if(income>500000 && income<1000000){
            System.out.println("Income tax is 20%");
            System.out.println("Your tax is " + (int)((income*20)/100));
        }else{
            System.out.println("Your tax is 30%");
            System.out.println("Your tax is " + (int)((income*30)/100));
        }


        //Print the largest of three numbers
        int A = 1 , B = 3,C = 6;
        if((A>=B) && (A>=C)){
            System.out.println("A is largest");
        }else if (B >= C){
            System.out.println("B is largest");
        }else{
            System.out.println("C is largest");
        }

        sc.close();
    }
}
