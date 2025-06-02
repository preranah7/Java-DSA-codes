package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        //super();//Immediate parent class
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}

//output
// Animal constructor is called
// Horse constructor is called
// brown 