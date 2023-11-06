package SDA2.ex3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7,6,5,1,2,3,5,7,9,3,4,5};
        System.out.println("Nr de triplete din sir este : "+checkNUmbersOfTriplet(numbers));

    }
    public static int checkNUmbersOfTriplet(int [] numbers){
        int numberOfTriplets = 0;
        //parcurg sirul de numere pana la numbers.lenght -2 pentru a verifica fiecare element cu urmatoarele doua
        //verific daca cele 3 numere consecutive indeplinesc conditiile de triplet
           //daca nr de la indicele i este precedat de nr de la indicele i+1 cu o diferenta de 1
           //daca nr de la indicele i+1 este precedat de nr de la indicele i+2 cu o diferenta de 1
        for (int i = 0; i < numbers.length -2 ; i++) {
            if (numbers[i] +1 == numbers[i+1] && numbers[i+1]+1 == numbers[i+2] ){
                numberOfTriplets++;
            }

        }
        return numberOfTriplets;

    }
}
