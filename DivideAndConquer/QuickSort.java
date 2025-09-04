package DivideAndConquer;
public class QuickSort{
    public static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void quickSort(int[] arr, int si, int ei)
    {
        // base case
        if(si>=ei)
        {
            return;
        }
        
        //work
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    
    public static int partition(int[] arr, int si, int ei)
    {
        int pivot = arr[ei];
        // to make spaces for the elements smaller than the pivot
        int i = si-1;
        
        for(int j = si; j<ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        // for pivot
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {12,56,66,1,23,-1, -1, 45, 98};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}