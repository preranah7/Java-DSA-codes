package TwoDarray;

public class spiralMatrix {

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //print top boundary
            for(int j=startCol ; j<=endCol ; j++){
                System.out.print(matrix[startRow][j]+" "); //startRow is fixed here
            }

            //print right boundary
            for(int i=startRow+1 ; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+" "); //endCol is fixed here
            }

            //print bottom boundary
            for(int j=endCol-1;j>=startCol;j--){
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" "); //endRow is fixed
            }

            //print left boundary
            for(int i=endRow-1 ; i>=startRow+1 ; i--){
                if(startCol == endCol ){
                    break;
                }
                System.out.print(matrix[i][startCol]+" "); //startCol is fixed
            }

            //variable update for inner boundaries if any
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
//output 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10