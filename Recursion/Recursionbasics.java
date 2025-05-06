package Recursion;

public class Recursionbasics {
    //print numbers in decreasing order recursively
    public static void printDec(int n){
        //defining a base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //defining a function first
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        //defining a base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);//
        System.out.print(n+" ");
    }

    public static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        // int fact_n_minus_1 = fact(n-1);
        int factorial = n * fact(n-1);
        return factorial;
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int summation = n + sum(n-1);
        return summation;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        ;
        int fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
        //otpt - 01123
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }

        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[] , int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[] ,int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }


    public static int power(int x, int n){
        if(n == 0){//O(n)
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n){//O(log n)

        //base case
        if(n == 0){
            return 1;
        }

        //int halfPowerSq =  optimizedPower(a, n/2) * optimizedPower(a, n/2); //O(n)

        int halfPower = optimizedPower(a, n/2);//O(log n)

        int halfPowerSq = halfPower * halfPower;


        //n is odd
        if(n % 2 !=0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]){
        // int n = 4;
        // printDec(n); //output - 10 9 8 7 6 5 4 3 2 1
        // printInc(n); //output - 1 2 3 4 5 6 7 8 9 10
        // System.out.println(fact(n)); //output - 120
        // System.out.println(sum(n));
        // System.out.println(fibonacci(n));
        int arr[] = {1,2,3,6,4,5};
        System.out.println(isSorted(arr, 0));
    }   
}