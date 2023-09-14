package SDA2.ex5;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,7,8,7,3,8,7,2,9};
        int n = 7;
        int k = 3;

        int index = findIndexNumbersOfAppearances(numbers,n,k);
        int nrOfAppearances= findNumberOfAppearances(numbers,n);
        System.out.println("Numarul " + n+ " apare de "+nrOfAppearances+" in sir");
        System.out.println("Indexul celei de-a "+k+" aparitii "+ "a nr "+n+ " este "+ index);


    }
    public static int findNumberOfAppearances(int [] numbers,int n){
        int numberOfAppearances = 0;
        for (int i =0; i< numbers.length;i++){
            if (numbers[i] ==n){
                numberOfAppearances++;
            }
        }
        return numberOfAppearances;
    }
    public static int findIndexNumbersOfAppearances(int [] numbers,int n,int k){
        int numberOfAppearances = 0;
        for (int i =0; i< numbers.length;i++){
            if (numbers[i] ==n){
                numberOfAppearances++;
            }
            if (numberOfAppearances == k){
                return i;
        }

    }
        return Integer.MIN_VALUE;
    }
}
