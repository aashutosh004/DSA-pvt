package sorting;

import java.util.Scanner;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
       Scanner scr = new Scanner(System.in);
       int num = scr.nextInt();
       int[] arr = new int[num];
       for(int i=0; i<=num-1; i++)
       {
           arr[i] = scr.nextInt(); 
       }

       insertionSort(arr);
       for(int i=0; i<=arr.length-1; i++)
       {
           System.out.print(arr[i]+" "); 
       }
       scr.close();
    }

    public static void insertionSort(int[] arr)
    {
        for(int i = 0; i<=arr.length-1; i++)
        {
            int j = i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
