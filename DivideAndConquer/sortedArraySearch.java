package DivideAndConquer;
public class sortedArraySearch
{
    public static int search(int[] arr, int target, int si, int ei)
    {
        // base case
        if(si>ei)
        {
            return -1;
        }

        // work
        int mid = si + (ei - si) / 2;

        if(arr[mid] == target)
        {
            return mid;
        }

        // line 1
        if(arr[si] <= arr[mid])
        {
            // case a
            if(target >= arr[si] && target <= arr[mid])
            {
                return search(arr, target, si, mid - 1);
            }
            // case b
            else
            {
                return search(arr, target, mid + 1, ei);
            }
        }

        // line 2
        else
        {
            // case c
            if(target >= arr[mid] && target <= arr[ei])
            {
                return search(arr, target, mid + 1, ei);
            }
            // case d
            else
            {
                return search(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 5, 6, 1, 2, 0};
        int target = 0;
        int value = search(arr, target, 0, arr.length - 1);
        System.out.println(value);
    }
}