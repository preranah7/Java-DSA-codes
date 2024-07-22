package JavaLec4;

public class advancedpatterns {

    public static void hollow_rectangle(int totRows , int totCols){
        //outer loop
        for(int i=1;i<=totRows;i++){
            //inner - columns
            for(int j=1;j<=totCols;j++){
                //cell-(i,j)
                if(i==1 || i == totRows || j==1 || j == totCols ){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //output
        //*******
        //*     *
        //*     *
        //*     *
        //*******

    }

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //output
         //     *
         //    **
         //   ***
         //  ****
         // *****
    }

    public static void inverted_half_pyramid_withNums(int n){
        for(int i=1;i<=n;i++){
            //inner - numbers
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //output
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

    }

    public static void floyds_triangle(int n){
        //outer loop
        int counter = 1;
        for(int i=1;i<=n;i++){
            //inner - how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
            //output
            // 1 
            // 2 3
            // 4 5 6
            // 7 8 9 10
            // 11 12 13 14 15
        }

    }

    public static void main(String[] args) {
        //hollow_rectangle(5, 7);
        //inverted_rotated_half_pyramid(5);
        //inverted_half_pyramid_withNums(7);
        floyds_triangle(5);
    
    }
}
