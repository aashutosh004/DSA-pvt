package searching;
import java.util.*;

public class BinarySearchRec
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int arraySize = scr.nextInt();

        int[] arr = new int[arraySize];
        System.out.println("Enter "+arraySize+" elements in array: ");

        for(int i=0; i<=arraySize-1; i++)
        {
            arr[i] = scr.nextInt();
        }

        System.out.println("Enter the value to search: ");
        int key = scr.nextInt();
        
        Arrays.sort(arr);
        int res = RecBinarySearch(arr,0,arr.length-1, key);

        System.out.println("Sorted Array :-");
        System.out.println(Arrays.toString(arr));

        if (res == -1) 
        {
            System.out.println("Element not found.");
        } 
        else 
        {
            System.out.println("Element found at index: " + res);
        }

        scr.close();
    }
    

    static int RecBinarySearch(int[] arr, int low, int high, int key)
    {

        if(low > high)
        {
            return -1;
        }
        else
        {
            int mid = (low+high)/2;

            if(key == arr[mid])
            {
                return mid;
            }

            else if(key < arr[mid])
            {
                return RecBinarySearch(arr, low, mid-1, key);
            }

            else
            {
                return RecBinarySearch(arr, mid+1, high, key);
            }
        }
    }
}