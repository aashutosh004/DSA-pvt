package Backtracking;

public class backtrackingArray {

    public static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int[] arr, int index, int value)
    {
        // base case
        if(index == arr.length)
        {
            printArray(arr);
            return;
        }

        // work
        arr[index] = value;
        changeArr(arr, index+1, value+1);
        arr[index] = arr[index] - 2;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }
}
