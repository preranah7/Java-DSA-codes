package OOPS;


public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //another method to set
        p1.color = "yellow";
        System.out.println(p1.color);
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "PreranaHippargi";
        System.out.println(myAcc.username);
        myAcc.setPassword("prerana");
        
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
        //System.out.println(password);
    }
}

class Pen{
    //prop + funx
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage = (phy + chem + maths) / 3;
    }
}