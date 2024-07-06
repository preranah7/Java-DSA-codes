package JavaLec2;

public class Ternary {
    public static void main(String[] args) {
        //Check odd or even
        int number = 4;
        String result = (number % 2 == 0) ? "Even":"Odd"; //Ternary Operator
        System.out.println(result);

        //Check if stdent will pass or fail
        int marks = 67;
        String reportCard = marks >= 33 ? "Pass" : "Fail";
        System.out.println(reportCard);
    }    
}
