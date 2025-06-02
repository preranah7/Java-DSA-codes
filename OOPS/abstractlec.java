package OOPS;

public class abstractlec {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{ 
    //cannot instantiate the type animal as it is a abstract class

    //abstract classes can have constructors
    String color;

    Animal(){
        color = "brown";
    }

    void eat(){ //non-abstract method
        System.out.println("animal eats");
    }

    abstract void walk(); 
    //this is a abstract method because it has no implementation defined
    //Implementation is to be defined in sub/derived classes
}

class Horse extends Animal {
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

//constructor hierarchy is - 
//Animal -> Horse i.e base class constructor called first then child class