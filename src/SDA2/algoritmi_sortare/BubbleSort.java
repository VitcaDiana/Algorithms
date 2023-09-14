package SDA2.algoritmi_sortare;

public class BubbleSort {
//    Repeat n-1 times
//    For i from 0 to n-2
//    If numbers[i] and numbers[i+1] out of order
//    Swap them
public static void main(String[] args) {
    int[] arr ={7,2,5,4,1,6,0,3};
    for (int i = 0; i < arr.length; i++) {
        boolean atLeastOneSwap = false;
        for (int j = 0; j < arr.length - i-1; j++) {
            if (arr[j] > arr[j+1]){
                atLeastOneSwap = true;
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
            }

        }
        if (!atLeastOneSwap){
            break;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
