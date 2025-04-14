package sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<=size-1; i++)
        {
            arr[i] = scr.nextInt();
        }

        for(int i = 0; i<=size-1; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        quickSort(arr, 0, size-1);

        for(int i = 0; i<=size-1; i++)
        {
            System.out.print(arr[i]+" ");
        }

        scr.close();
    }

    public static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pIndex = partionIndex(arr,low,high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
        
    }

    public static int partionIndex(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr[i] <= pivot && i<=high-1)
            {
                i++;
            }

            while(arr[j] > pivot && j>=low+1)
            {
                j--;
            }

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
