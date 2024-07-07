package JavaLec3;

import java.util.*;

public class Continue {
    public static void main(String[] args) {
        //Continue keyword is used to skip an interation
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        //Question2)Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("Number is" + n);
          }while(true);
          
    } 
}
