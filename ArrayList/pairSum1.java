package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class pairSum1 
{
    // bruteforce - O(n^2)
    public static boolean PairSum1(ArrayList<Integer> list, int target)
    {
        Collections.sort(list);
        for(int i = 0; i<list.size(); i++)
        {
            for(int j = i+1; j<list.size(); j++)
            {
                if(list.get(i) + list.get(j) == target)
                {
                    System.out.println("The pair is: " + list.get(i) + " and " + list.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    // 2 pointers approach
    public static boolean PairSum2Pointer(ArrayList<Integer> list, int target)
    {
        Collections.sort(list);
        int lp = 0;
        int rp = list.size() - 1;
        while(lp < rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                System.out.println("The pair is: " + list.get(lp) + " and " + list.get(rp));
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        //func call
        System.out.println(PairSum2Pointer(list, 7));
    }    
}
