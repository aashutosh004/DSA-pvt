package ArrayList;

import java.util.ArrayList;

public class monotonicAL 
{
    public static boolean monotonicArrayList(ArrayList<Integer> list)
    {
        boolean increasing = true;
        boolean decreasing = true;

        if(list.size()<=1)
        {
            return true;
        }
        for(int i = 0; i<list.size()-1; i++)
        {
            if(list.get(i) < list.get(i+1))
            {
                decreasing = false;
            }
            if(list.get(i) > list.get(i+1))
            {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(monotonicArrayList(list));
    }    
}
