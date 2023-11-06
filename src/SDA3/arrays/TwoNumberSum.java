package SDA3.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,5,-4,8,11,1,-1,6);
        Integer sum = 10;
        System.out.println(findTwoNumbersSum(numbers,10));


    }
    public static List<Integer> findTwoNumbersSum(List<Integer> numbers,Integer sum){
        //parcurg fiecare element
        //facem diferenta intre sum si elementul curent
        //daca diferenta nu este in set, adaug nr curent in set
        //daca diferenta este in set, atunci returnez perechea formata din nr curent si diferenta
        Set<Integer> numberSet = new HashSet<>();
        for(Integer number: numbers){
            int diference = sum - number;
            if (numberSet.contains(diference)){
                return List.of(diference,number);
            }
            numberSet.add(number);

        }
        return List.of(0,0);
    }
}
