//Take input and access for 2D arrays 
package TwoDarray;
import java.util.*;
public class Matrices {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length;//rows
        int m = matrix[0].length;//columns
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //elements output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix , 5);
        sc.close();

    }

    
}
//output
// 1 2 3 4 5 6 7 8 9
// 1 2 3 
// 4 5 6
// 7 8 9
//Element found at cell (1,1)