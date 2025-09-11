package ArrayList;
import java.util.ArrayList;
public class pairSum2 
{
    public static boolean PairSum2(ArrayList<Integer> list, int target)
    {
        int n = list.size();
        // pivot calculate

        // int pivot = n-1;
        // for(int i = 0; i<n; i++)
        // {
        //     for(int j = i+1; j<n; j++)
        //     {
        //         if(list.get(i) > list.get(j))
        //         {
        //             pivot = i;
        //         }
        //     }
        // }

        // efficient way of calculating O(n)
        int pivot = -1;
        for(int i = 0; i<list.size(); i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                pivot = i;
                break;
            }
        }

        // 2 pointer
        int lp = pivot+1;
        int rp = pivot;

        while(lp != rp)
        {
            if(list.get(lp) + list.get(rp) == target)
            {
                System.out.println("The pair is : " + list.get(lp) + " and " + list.get(rp));
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target)
            {
                lp = (lp+1) % n;
            }
            else
            {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);    
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(PairSum2(list, 122));
    }    
}
