package JavaLec5;
public class Logicbuilding {
    //only for n>=2
    public static boolean isPrime(int n){
        //corner case for 2
        if(n==2){
            return true;
        }
            for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            
            }    
        }
        return true ;

}

    public static void primesInRange(int n){ 
           for(int i = 2; i <= n; i++){
            if(isPrime(i)){ //true
                System.out.println(i);
            }
        }   System.out.println();

}

//decimal to binary
public static void binToDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum>0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2,pow));


        pow++;
        binNum = binNum/10;
    }
    System.out.println("Decimal of "+ myNum+ " = "+ decNum);
}


public static void decToBin(int decNum){
    int myNumber = decNum;
    int power = 0;
    int bin = 0;
    while(decNum>0){
        int rem = decNum%2;
        bin = bin + (rem * (int)Math.pow(10, power));

        power++;
        decNum = decNum/2;
    }
    System.out.println("Binary of "+myNumber +"is "+bin);

}
public static void main(String[] args) {
        //primesInRange(20);//2 to 20
        //binToDec(101);
        decToBin(12);
    }
}
