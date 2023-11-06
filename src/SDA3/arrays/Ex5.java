package SDA3.arrays;

import java.util.Arrays;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr1 = {-1,5,10,20,28,3};
        int[] arr2 = {26,134,135,15,17};
        int[] result = smallestDifference(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }
    public static int[] smallestDifference(int[] arr1,int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDifference = Integer.MAX_VALUE;
        int[] result = new int[2];

        int index1 = 0;
        int index2 = 0;

        while (index1<arr1.length && index2<arr2.length){
            int val1 = arr1[index1];
            int val2 = arr2[index2];

            int difference = Math.abs(val1 - val2);
            if (difference < minDifference){
                minDifference = difference;
                result[0] = val1;
                result[1] = val2;
            }
            if (val1 <val2){
                index1++;
            }else {
                index2++;
            }
        }
        return result;

    }
}
