package sorting;
import java.util.*;
public class SelectionSort{

    static void SelectionSorting(int[] arr,int size)
    {
        for(int i=0; i<=size-2; i++)
        {
            int min = i;

            for(int j=i; j<=size-1; j++)
            {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = scr.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter "+size+" elements in array: ");
        for(int i = 0; i<=size-1; i++)
        {
            arr[i] = scr.nextInt();
        }

        SelectionSorting(arr,size);

        for(int i = 0;i<=size-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scr.close();
    } 
}
