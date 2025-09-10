package ArrayList;
import java.util.ArrayList;
public class containerWMWater 
{
    // bruteforce - O(n^2) time complexity
    public static int mostWaterContain(ArrayList<Integer> height)
    {
        int maxWater = 0;

        for(int i = 0; i<height.size(); i++)
        {
            for(int j = i+1; j<height.size(); j++)
            {
                int hgt = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = hgt * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // 2 pointers approach - O(n) time complexity
    public static int containedWater(ArrayList<Integer> height)
    {
        int maxWater = 0;

        int lp = 0;
        int rp = height.size() -  1;
        while(lp < rp)
        {
            int hgt = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = hgt * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if(height.get(lp) < height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // fnc call
        System.out.println("Maximum Water Stroed: " + containedWater(height));
    }
}    
