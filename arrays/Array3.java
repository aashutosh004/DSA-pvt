import java.util.Scanner;

public class Array3 {

    // Array is sorted or not
    
    static String arrayIsSorted(int[] arr, int num)
    {
        for(int i = 1; i<num;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return "Fasle";
            }    
        }
        return "True";
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i] = scr.nextInt();
        }
        String res = arrayIsSorted(arr,num);
        System.out.println(res);

        scr.close();
    }
}
