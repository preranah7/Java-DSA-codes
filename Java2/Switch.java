package JavaLec2;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUM1");
        int num1 = sc.nextInt();
        System.out.println("ENTER NUM2");
        int num2 = sc.nextInt();
        System.out.println("Enter operator to perform from +,-,*,/,%");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': System.out.println("Sum = "+(num1 + num2));
                      break;
            case '-': System.out.println("Difference = "+(num1-num2));
                      break;
            case '*': System.out.println("Product = "+(num1*num2));
                      break;
            case '/': System.out.println("Division = "+(num1/num2)); 
                      break;
            case '%': System.out.println("Remainder = "+(num1%num2)); 
                      break;
            default : System.out.println("Wrong Operator");
        }
        sc.close();
    }
}
