package JavaLec5;
import java.util.*;
public class Functions {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("namaste");
        return;
    }
    public static int calculateSum(int a,int b){ //parameters or formal parameters
        int sum = a+b;
        return sum;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);//arguments or actual parameters
        System.out.println("Sum is " + sum);
        printHelloWorld();
        sc.close();

    }
}
