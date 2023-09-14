package SDA2.ex7;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 3},

        };
        System.out.println("Matricea initiala: ");
        displayMatrix(matrix);
        swapColumns(matrix,0,1);
        System.out.println("Matricea dupa interschimbare:");
        displayMatrix(matrix);





    }
    public static int [][] swapColumns(int [][] matrix,int n,int m) throws Exception {
        for (int i = 0 ; i < matrix.length; i++){
            if (n >=0 && n < matrix[i].length && m >=0 && m < matrix[i].length){
                int temp = matrix[i][n];
                matrix[i][n] = matrix[i][m];
                matrix[i][m] = temp;
            }else{
                throw new Exception("Indicii coloanelor nu sunt valizi");

            }
        }
        return matrix;

    }
    public static void displayMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
