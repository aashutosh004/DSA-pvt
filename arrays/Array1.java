// import java.util.*;

public class Array1 {
    public static void main(String[] args) {

        // 1) brute force approach
    //     int[] arr1 = {10,12,11,2,5};
    //     int [] arr2 = {8,23,24,9,7};
    //     System.out.println(sortedArray(arr1));
    //     System.out.println(sortArray(arr2));
    // }

    // static int sortedArray(int arr[]){
    //     Arrays.sort(arr);
    //     return arr[arr.length - 1];


        // 2) optimized solution
        int[] arr1 = {10,12,11,2,5};
        int[] arr2 = {8,23,24,9,7};
        System.out.println(lagestArray(arr1));
        System.out.println(lagestArray(arr2));
    }

    static int lagestArray(int[] arr){
        int largest = arr[0];
        for(int i=0;i<arr.length ;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
