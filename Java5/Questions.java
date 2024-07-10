package JavaLec5;

public class Questions {

    public static void swap(int a,int b){
        //swap - values exchange
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);

    }

    public static int multiply(int a , int b){
        //product
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        //factorial of positive integers
        int f=1;
        for(int i=1;i<=n;i++ ){
            f = f*i;
        }
        return f; //factorial of n

    }

    public static int bincoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_n_r);
        return bincoeff;
    }




    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        //swap(a,b);
        // int product= multiply(a, b);
        // System.out.println(product);
        // int prod = multiply(4, 3);
        // System.out.println(prod);
        //System.out.println(factorial(8));
        //System.out.println(bincoeff(5, 2));
    }
}



