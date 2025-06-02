package OOPS;

public class inheritance {
    public static void main(String[] args) {
        // Fish goldfish = new Fish();
        // goldfish.eat(); 


        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class
class Fish extends Animal{ //single level inheritance / heirarchical 
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}


class Mammal extends Animal{ //hierarchical
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{ //hierarchical
    void fly(){
        System.out.println("fly");
    }
}

class Dog extends Mammal{ //multilevel
    String breed;
}