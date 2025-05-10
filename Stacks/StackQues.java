package Stacks;
import java.util.*;
public class StackQues {

    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length;i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }

        for(int i=0;i<span.length;i++){
            System.out.println(span[i] + " ");
        }
    }


    public static void nextgreater(int nxtGreater[],int arr[]){
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            //step1 - while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //step2 - if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;  
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            //step3 - push in stack
            s.push(i);

        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

        //next Greater Right
        //next Greater Left(for loop start form 0 to n)
        //next Smaller Right(arr[s.peek()] >= arr[i])
        //next Smaller Left((for loop start form 0 to n) , (arr[s.peek()] >= arr[i]))

    }


    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;  
                }
                if((s.peek() == '(' && ch == ')') //()
                || (s.peek() == '[' && ch == ']') //[]
                || (s.peek() == '{' && ch == '}')){ //{}
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isDuplicate(String str1){//O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            //closing
            if (ch == ')') {
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate exists
                }else{
                    s.pop(); //opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }


    public static void maxArea(int arr1[]){
        int maxArea = 0;
        int nsr[] = new int[arr1.length];
        int nsl[] = new int[arr1.length];

        //Next smaller right - O(n)
        Stack<Integer> s = new Stack<>();

        for(int i=arr1.length-1; i>=0; i--){
            while (!s.isEmpty() && arr1[s.peek()] >= arr1[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr1.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next smaller left - O(n)
        s = new Stack<>();

        for(int i=0; i<arr1.length; i++){
            while (!s.isEmpty() && arr1[s.peek()] >= arr1[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area : width = j-i-1 = nsr[i] - nsl[i] - 1
        for(int i=0;i<arr1.length;i++){ //O(n)
            int height = arr1[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Maximum Area in Histogram = "+ maxArea);
    }

    
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        //stockSpan(stocks, span);


        int arr[] = {6, 8, 0, 1, 3};
        int nxtGreater[] = new int[arr.length];
        //nextgreater(nxtGreater, arr);


        //valid paranthesis
        String str = "()({})[]";
        //System.out.println(isValid(str));//O(n)


        //duplicate paranthesis
        String str1 = "((a+b))";//true
        String str2 = "(a-b)";//false
        //System.out.println(isDuplicate(str2));


        //maximum rectangular area in histogram - O(n)
        int arr1[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr1);
    }
}