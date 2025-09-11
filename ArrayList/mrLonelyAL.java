package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class mrLonelyAL 
{
    public static ArrayList<Integer> mrlonely(ArrayList<Integer> list)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        // 0 or 1 element in the list
        if(list.size()<=1)
        {
            return list;
        }

        Collections.sort(list);

        // first element
        if (list.get(0) + 1 < list.get(1))
        {
            ans.add(list.get(0));
        }

        // middle elements
        for(int i = 1; i<list.size()-1; i++)
        {
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1))
            {
                ans.add(list.get(i));
            }
        }

        // last element
        if(list.get(list.size()-2)+1 < list.get(list.size()-1))
        {
            ans.add(list.get(list.size()-1));
        }
        return ans; 
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(11);
        list.add(13);

        System.out.println(mrlonely(list));
    }    
}