package DSAarray;

public class TrapRainwater {

    public static int trappedRainwater(int height[]){
        //calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];//no left boundary to the 0th start index
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];//height of last index, no right boundary for the last bar
        for(int i=height.length-2 ;i>=0 ; i-- ){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop{
        for(int i=0;i<height.length;i++){//on whichever bar I am my trappedwater is
            //waterlevel = min(left max bound , right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = (waterlevel - height[i]) * width . width in this case is 1
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        //Width for every bar is 1
        System.out.println(trappedRainwater(height));
    }
    
}
//Time Complexity -> O(n)
