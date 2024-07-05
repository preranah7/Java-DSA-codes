import java.util.*;

public class Questions {
    public static void main(String args[]) {
        //Sum of two variables a and b
        int a = 10;
        int b = 12;
        int sum = a+b;
        System.out.println("Sum of two variables is: "+sum);

        //sum of two variables input from user
        Scanner sc = new Scanner(System.in);//sc object declared
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();//c variable defined
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();//d variable defined
        int addition = c+d;//addition variable defined to store the addition of two variables
        System.out.println("Addition of two variables is: "+addition);
        sc.close();//sc object is closed
    }
}
