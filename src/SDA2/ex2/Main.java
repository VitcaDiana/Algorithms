package SDA2.ex2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 5, 6, 4, 7, 8};
        int n = 3;
        int m = 5;
         boolean nextToEachOther = false;

        //parcurgem sirul si verificam fiecare pereche de elemente consecutive
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            //verificam daca perechea este formata din n sau m sau m si n
            if ((currentNumber == n && nextNumber==m) || (currentNumber == m && nextNumber == n )){
                nextToEachOther = true;
                break;

            }
        }
        if (nextToEachOther){
            System.out.println("Valorile " + n +" si " + m+" apar unul langa celalalt in sir");
        }else{
            System.out.println("Valorile " + n +" si " + m+"  nu apar unul langa celalalt in sir");
        }

    }


}
