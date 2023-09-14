package SDA2.algoritmi_cautare;

import java.util.Arrays;

public class CautareBinara {
    public static void main(String[] args) {
//        If no doors left
//        Return false
//        If 50 is behind doors[middle]
//        Return true
//        Else if 50 < doors[middle]
//        Search doors[0] through doors[middle - 1]
//        Else if 50 > doors[middle]
//        Search doors[middle + 1] through doors[n - 1]
        int[] arr ={7,2,5,4,1,6,0,3};
        Arrays.sort(arr);
        System.out.println( binarySearch(arr,6,0,arr.length-1));
        System.out.println(binarySearchIt(arr,6));
    }
    public static int binarySearch(int[] array,int target,int left,int right){
        //conditia de oprire
        if (left > right){
            return -1;
        }
        int middle = (left + right)/2;
        if (array[middle] == target){
            return middle;
        }else if (target < array[middle]){

            return binarySearch(array,target,left,middle-1);
        } else {
            return binarySearch(array,target,middle+1,right);

        }

    }
    public static int binarySearchIt(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int middle = (left + right)/2;
            if (array[middle] == target){
                return middle;
            }else if (target < array[middle]){

                right = middle -1;
            } else {
                left = middle + 1;
            }
        }
        return -1;

    }
}
