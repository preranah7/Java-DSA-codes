
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("add = "+(a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("div = "+(a/b));
        System.out.println("mod = "+(a%b));

        //Pre Increment Operator
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        //output
        //11
        //11
        //c is preincremented by 1 and updated to d
        
        int e = 10;
        int f = e++;
        System.out.println(e);
        System.out.println(f);
        //output
        //11
        //10
        //e is incremented by 1 but is not updated to f as f has used e = 10 and then e is incremented
        //Same is applicable with Decrement Operator

        //System.out.println("Relational Operators");
        //equal to equal to , less than , greater than , leass than equal to , grater than equal to , not equal

        //System.out.println("Logical Operators");
        //AND &&
        //OR ||
        //LOGICAL NOT !

        //ASSIGNMENT OPERATORS
        //int a = a + 5;
        //a += 5  Both are same
    }

}
