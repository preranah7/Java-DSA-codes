import java.util.*;
public class Homeworkques {
    public static void main(String[] args) {
       // To print avg of three numbers
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers");
        System.out.println("Enter num1 = ");
        float num1 = sc.nextFloat();
        System.out.println("Enter num2 = ");
        float num2 = sc.nextFloat();
        System.out.println("Enter num3 = ");
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println("Average of three numbers is "+avg);
        sc.close();

        //Area of square
        System.out.println("Area of square");
        System.out.println("Enter the side of square, side = ");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("Area of square is "+area);

        //Variable used here is a valid variable
        int $ = 24;
        $ += 6;
        System.out.println($); //output 30,Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”)

        // You have to output the total cost of the items back to the user as their bill
        System.out.println("Bill calculation with gst of three objects");
        System.out.println("Enter the price of item1 = ");
        Scanner s = new Scanner (System.in);
        float price1 = s.nextFloat();
        System.out.println("Enter the price of item2 = ");
        float price2 = s.nextFloat();
        System.out.println("Enter the price of item3 = ");
        float price3 = s.nextFloat();
        float Amount = (price1+price2+price3);
        System.out.println("Amount is "+Amount);
        float TotalAmount = Amount + ((Amount * 18)/100);
        System.out.println("Total amount considering 18% GST is "+TotalAmount);
        s.close();

    }
}
