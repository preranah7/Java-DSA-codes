import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        int a = 25;
        long b = a;
        System.out.println(b);//This conversion is valid
        long c = 25;
        int d = c;//This conversion is not possible

        Scanner sc = new Scanner(System.in);
        int number = sc.nextFloat() //cannot convert from float to int
        System.out.println(number);

        float number2 = sc.nextInt();//conversion possible from int to float
        System.out.println(number2);

        sc.close();

    }
}

//This is called implicit,widening or type conversion in java.
//All following conversions are valid(backwards is invalid)
//byte --> short --> int --> float --> long --> double


//char to int (number) is valid as a character is assigned with a number internally in Java 
// public class TypeConversion {
//     public static void main(String args[]){
//         char ch='a';
//         char ch2='b';
//         int number = ch;
//         int number2 = ch2;
//         System.out.println(number);
//         System.out.println(number2);

//         //output
//         97
//         98
//     }
// }
