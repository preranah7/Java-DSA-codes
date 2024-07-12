package DSAarray;
//import java.util.*;
public class arrArguments {

    public static void update(int marks[] , int nonChangable){
        nonChangable = 10; //does not gets updated
        for(int i=0;i<marks.length;i++){ //gets updated because of call by reference
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99}; //array arguments are always passed as call by reference hence they are updated 
        int nonChangable = 5; // call by value cant get updated
        update(marks , nonChangable);
        System.out.println(nonChangable);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }  

}

//output
//5
//98 99 100
