package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int size = scr.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        for(int i = 0; i<=size-1; i++)
        {
            arr[i] = scr.nextInt();
        }

        // before

        System.out.println("Array before sorting: ");
        for(int i = 0; i<=size-1; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //after

        mergeSort(arr, 0, size-1);

        System.out.println("Array after sorting: ");

        for(int i =0; i<=size-1; i++)
        {
            System.out.print(arr[i]+" ");
        }

        scr.close();
    }

    // merge
    public static void merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }

        // from temp to original array

        for(int i = low; i <= high; i++)
        {
            arr[i] = temp.get(i-low);
        }
    }

    // merge sort
    public static void mergeSort(int[] arr, int low, int high){
        // base case 
        if(low>=high)
        {
            return;
        }

        int mid = (low+high)/2;
       mergeSort(arr, low, mid);
       mergeSort(arr, mid+1, high);
       merge(arr,low,mid,high); 
    }
}
