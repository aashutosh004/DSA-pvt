package sorting;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) 
    {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int num = scr.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements in array: ");
        for(int i=0; i<num; i++)
        {
            arr[i] = scr.nextInt();
        }

        bubbleSort(arr);

        for(int i = 0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }

        scr.close();
    }

    public static void bubbleSort(int[] arr)
    {
        int num = arr.length;
        for(int i = num-1; i>=1; i--)
        {
            for(int j = 0; j<=i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
