package array;

public class trappingRainwater 
{
       public static int trap(int[] height)
       {
              // left
              int[] leftMax = new int[height.length];
              leftMax[0] = height[0];
              for(int i = 1; i<height.length; i++)
              {
                     leftMax[i] = Math.max(height[i], leftMax[i-1]);
              }

              // right
              int rightMax[] = new int[height.length];
              rightMax[height.length-1] = height[height.length-1];
              for(int i = height.length - 2; i>=0; i--)
              {
                     rightMax[i] = Math.max(height[i], rightMax[i+1]);
              }

              // water level
              int trappedWater = 0;
              for(int i = 0; i<height.length; i++)
              {
                     int waterLevel = Math.min(leftMax[i], rightMax[i]);
                     trappedWater = trappedWater + (waterLevel - height[i]);
              }

              return trappedWater;
       } 

       public static void main(String[] args)
       {
              int arr[] = {4, 2, 0, 6, 3, 2, 5};
              int result = trap(arr);
              System.out.println(result);
       }
}
