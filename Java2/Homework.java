package JavaLec2;
import java.util.*;
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1)whether num is positive or negative
        System.out.println("Enter a number");
        float number = sc.nextFloat();
        if (number>0) {
            System.out.println("Number entered is positive");
        }else if(number<0) {
            System.out.println("Number entered is negative");
        }else if (number == 0) {
            System.out.println("Number 0 is neither positive nor negative");
        }


        //2)Do you have a fever or not
        double temp=103.5;
        if (temp>100) {
            System.out.println("You have a fever");
            }else {
                System.out.println("You don't have a fever");
            }  
            
        
        //3)Write a Java program to input week number (1-7) and print day of week name using switch case
        System.out.println("Enter a weekday number");
        int DayNum = sc.nextInt();
        switch (DayNum) {
            case 1: System.out.println("Today is Monday");
                    break;
            case 2: System.out.println("Todat is Tuesday");
                    break;
            case 3: System.out.println("Today is Wednesday");
                    break;
            case 4: System.out.println("Today is Thursday");
                    break;
            case 5: System.out.println("Today is Friday");
                    break;
            case 6: System.out.println("Today is Saturday");
                    break;
            case 7: System.out.println("Today is Sunday");
                    break;
            default : System.out.println("A week has only 7 days");
        }

        //4)Write a Java program that takes a year from the user and print whether that year is a leap year or not
        System.out.println("Enter year");
        int year = sc.nextInt();
        if ((year%4==0 && year%100==0) && (year%400==0)){
            System.out.println("Year is a leap year");
        }else{
            System.out.println("Year is not a leap year");
        }
        sc.close();
    }

}

