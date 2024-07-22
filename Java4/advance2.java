package JavaLec4;

public class advance2 {
   
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ //even
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        //output
        // 1
        // 01
        // 101
        // 0101
        // 10101
    }

    public static void butterfly(int n){
        //first half
        for(int i=1;i<=n;i++){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //output
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
    }

    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //output
        //      *****
        //     *****
        //    *****
        //   *****
        //  *****
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n ;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for(int j=1;j<=n;j++){
                if(i==1 || i == n || j==1 || j == n ){
                        //boundary cells
                        System.out.print("*");
                }else{
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
          //output
          //        *****
          //       *   *
          //      *   *
          //     *   *
          //    *****
    }

    public static void diamond(int n){
        //first half
        for(int i=1; i<=n ;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n; i>=1 ;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //output
    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *

    }
  
    public static void main(String[] args) {
       // zero_one_triangle(5);
       //butterfly(4);
       //solid_rhombus(5);
       //hollow_rhombus(5);
       diamond(4);

    }
}
