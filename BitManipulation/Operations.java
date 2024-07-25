package BitManipulation;

public class Operations {
    
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        //First approah
        // if(newBit == 0 ){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //Second approach
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIbits(int n,int i){
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }

    public static void operations(){
        System.out.println(( 5 & 6 )); // AND output 4
        System.out.println(( 5 | 6 )); // OR output 7
        System.out.println(( 5 ^ 6 )); // XOR output 3
        System.out.println(( ~5 )); //One's Complement output -6
        System.out.println(( 5<<2 )); //20 binary left shift
        //a<<b = a * 2^b (2(to the power)b)
        System.out.println(( 6>>1 )); //3 binary right shift
        //a>>b = a/2^b
    }
    public static void main(String args[]){
       System.out.println(getIthBit(10, 3));
       System.out.println(setIthBit(10, 2));//14
       System.out.println(clearIthBit(10, 1));//8
       System.out.println(updateIthBit(10, 2, 1));//14
       System.out.println(clearIbits(15, 2));//12
    }
}
