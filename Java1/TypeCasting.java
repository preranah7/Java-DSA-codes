//Type casting or Narrowing conversion or Explicit conversion
import java.util.*;
public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b =  (int)a;//Type casting of float into int 
        //Digits after Decimal will be eliminated in the output
        System.out.println(b);
        sc.close();
    }
}
