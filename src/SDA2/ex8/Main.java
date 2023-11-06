package SDA2.ex8;

public class Main {
    public static void main(String[] args) {
        //Input : 7
        //Output :
        //
        //    *******
        //    **   **
        //    * * * *
        //    *  *  *
        //    * * * *
        //    **   **
        //    *******
        int n = 7;
        //parcurg randurile
        for (int i = 0; i < n; i++) {
            //parcurg coloanele
            for (int j = 0; j < n; j++) {
                //daca suntem la prima sau la ultima linie printam *
                //daca suntem la prima sau ultima coloana printam *
                //daca suntem pe diagonala principala sau pe cea secundara printam *
                if (i ==0 || i == n-1 || j ==0 || j == n-1 || i ==j || j == n-i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
