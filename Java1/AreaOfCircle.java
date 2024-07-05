import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //To calculate the area
        Scanner s = new Scanner(System.in);//s object declared
        System.out.println("Enter the value of radius: ");
        float radius = s.nextFloat();//radius variable defined
        float area = 3.14f*radius*radius;//area variable defined to store the area
        System.out.println("Area of circle is: "+area);
        s.close();
    }
    
}
