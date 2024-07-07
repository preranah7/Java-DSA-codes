package JavaLec3;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        //break --> to exit the loop
        for(int i=1;i<=5;i++){
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        //output
        //1
        //2
        //I am out of the loop

        //Question
        //Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);

        sc.close();

    }
}
