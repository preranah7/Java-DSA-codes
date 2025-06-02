package OOPS;

public class polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();

        // System.out.println(calc.sum(1,2));

        // System.out.println(calc.sum((float)1.5,(float)(2.3)));

        // System.out.println(calc.sum(1,2,3));

        Deer d = new Deer();
        d.eat();

    }
}

class Calculator{ //method overloading - compile time
    int sum(int a,int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }
}

class Deer extends Animal{ //Method Overiding
    void eat(){
        System.out.println("Eats, but is a herbivore");
    }
}