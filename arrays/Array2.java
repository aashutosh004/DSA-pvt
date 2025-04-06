import java.util.*;

public class Array2 
{
    // Second Largest element in an array
    // Brute Force Approach

    static int secondLargest(int[] arr, int n)
    {
       int largest = arr[0];
       int sLargest = -1;

       for(int i = 0; i<=arr.length-1;i++)
       {
            if(arr[i]>largest)
            {
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest)
            {
                sLargest = arr[i];
            }
       }
       return sLargest;

    }
    public static void main(String[] args) {
        // int arr[] = {1,2,4,7,7,5};
        // Arrays.sort(arr);
        // int largest = arr[arr.length-1];
        // int secondLargest = -1;
        // for(int i = arr.length-2;i>=0;i--)
        // {
        //     if(arr[i]!=largest)
        //     {
        //         secondLargest = arr[i];
        //         break;
        //     } 
        // }

        // if(secondLargest != -1)
        // {
        //     System.out.println(secondLargest);
        // }
        // else{
        //     System.out.println("No Second Largest");
        // }


        // Better Approach , Without Sorting
        // int largest = arr[0];
        // int secLargest = -1;
        // for(int i = 0; i<arr.length; i++)
        // {
        //     if(arr[i]>largest)
        //     {
        //         largest = arr[i];
        //     }
        // }

        // for(int i = 0;i<arr.length;i++)
        // {
        //     if(arr[i]>secLargest && arr[i] != largest)
        //     {
        //         secLargest = arr[i];
        //     }
        // }
        // System.out.println(secLargest);


        // Optimized approach

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int num = scr.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter Elements in array: ");
        for(int i=0;i<num;i++)
        {
            arr[i] = scr.nextInt();        
        }
        scr.close();

        int secLargest = secondLargest(arr, num);
        System.out.println("Second Largest number is: "+secLargest);
    }
}
