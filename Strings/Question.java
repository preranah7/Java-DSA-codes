//Given a route containing 4 directions (E,W,N,S) find the shortest path to reach destination
package Strings;

public class Question {

    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            } 

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

        //output 5.0
        //Time Complexity - O(n)
        }
    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));


        
        String fruits[] = {"apple","mango","banana"}; //largest string lexicographically
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){ //less than 0 is the case where largest is smaller than fruits[i]
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        //output mango
        //Time complexity - O(x * N)
        //x - string with maximun length
        //n - number of strings

    }
    
}