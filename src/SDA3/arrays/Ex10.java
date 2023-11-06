package SDA3.arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
        };
        int searchElement = 45;
        if (searchInSortedMatrix(matrix,searchElement)){
            System.out.println("Elementul " + searchElement+ " a fost gasit in matrice");
        }else{
            System.out.println("Elementul "+searchElement+" nu a fost gasit in matrice");
        }

    }

    public static boolean searchInSortedMatrix(int [][] matrix,int element){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = 0 ;
        int col = matrix[0].length -1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == element){
                return true;
            }else if(matrix[row][col] > element){
                col--;//deplasere spre stanga
            }else{
                row++;//deplasare in jos
            }
        }
        return false;
    }
}
