public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);//output a
        System.out.println(b-a);//output 1
        
        short c = 8;
        byte d = 8;
        char e = 'e';
        byte bt = (byte)(c+d+e);//typecasting because java converts short,byte,char into integer and integer to byte type conversion is not possible 
        System.out.println(bt);

        int g = 10;
        float h = 20.25f;
        long i = 25;
        double j = 30.25;
        double ans = g+h+i+j;
        System.out.println(ans);
    
    }
}
//Type promotions are only applicable to arithmetic expressions
//Java automatically promotes each byte,short,char operand to int when evaluating an expression
//If one operand is long,float,double then whole expression is promoted to long,float or double respectively(the one with big size datatype)

//eg
//byte b = 10;
//byte a = b*2; this will give error as b is promoted to int in  the expression by type promotion and it is getting stored in byte

//byte b=5;
//byte a = (byte)(b*2) typecasting here 
//This is valid

