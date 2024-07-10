package JavaLec5;

public class funOverloading {
    //overloading using parameters
    //func to calc sum of 2 nums
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    
    //func to calc sum of 3 nums
    public static int sum(int a,int b,int c){
        return a+b+c;
    }    
    
    //overloading using data types
    //func to calculate int sum
    public static int sum(int a , int b){
        return a+b;
    }

    //func to calculate float sum
    public static float sum(float a , float b){
        return a+b;
    }
    
    
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f , 4.8f));
    }
}
//function overloading completely depends on change of parameters and not return type
//same function name with same parameters and different data types will give a error