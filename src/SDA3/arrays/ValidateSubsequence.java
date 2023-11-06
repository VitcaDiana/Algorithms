package SDA3.arrays;

import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,1,2,25,6,-1,8,10);
        List<Integer> subArray = List.of(1,6,-1,10);
        System.out.println(isValidSequence(numbers,subArray));


    }
    //initial pointerul numbers si pointerul subArray sunt 0
    //atata timp cat pointerul numbers nu a ajuns la final si pointerul subArray nu a ajuns la final
    //daca valorile de la pointeri sunt egale, fiecare pointer il incrementez
      //altfel incrementez pointerul numbers
    //return valoarea comparatiei dintre lungimea subArray si poinerul subArray
    public static boolean isValidSequence(List<Integer> array,List<Integer> subArray){
        int arrayPointer = 0;
        int subArrayPOinter = 0;
        while (arrayPointer <array.size() && subArrayPOinter < subArray.size()){
            if (array.get(arrayPointer).equals(subArray.get(subArrayPOinter))){
                subArrayPOinter++;
            }
            arrayPointer++;
        }
        return subArrayPOinter == subArray.size();

    }

}
