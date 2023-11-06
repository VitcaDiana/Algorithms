package SDA3.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    //1,2,3,4
    //12,13,14,5
    //11,16,15,6
    //10,9,8,7
    public static void main(String[] args) {
        int[][] array ={
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}


        };
        System.out.println(spiralTraverse(array));

    }
    public static List<Integer> spiralTraverse(int[][] array){
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length-1;
        int stratCol = 0;
        int endCol = array[0].length-1;
        while (stratCol <=endCol &&startRow<= endRow) {

            for (int col = stratCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= stratCol; col--) {
                result.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                result.add(array[row][stratCol]);
            }
            startRow++;
            endRow--;
            stratCol++;
            endCol--;
        }
        return result;
    }
}
