package SDA2.algoritmi_sortare;

public class SelectionSort {
    //For i from 0 to n-1
//    Find smallest number between numbers[i+1] < numbers[lenght-1]
//    Swap smallest number with numbers[i]
    public static void main(String[] args) {
        int[] arr ={7,2,5,4,1,6,0,3};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            //gasim minimul de la i+1 la n
            int minIndex = findMin(arr,i+1,arr.length);
            soap(arr,minIndex,i);
        }

    }
    public static int findMin(int[] arr,int begin,int end){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = begin; i< end ; i++) {
            if (arr[i]<min){
                min = arr[i];
                minIndex = i;

            }

        }
        return minIndex;
    }
    public static void soap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
