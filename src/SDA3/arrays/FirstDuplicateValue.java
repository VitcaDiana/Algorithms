package SDA3.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicateValue {
    //2,1,5,2,3,3,4

    //brute force - imi generez toate posibilele solutii - ex for in for
    //sortez initial array-ul
    //parcurg cu 2 pointeri
    //imi iau o structura de date ajutatatoare(un alt array,un set un map)
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,1,5,2,3,3,4);
        System.out.println( getFirstDuplicateValue(numbers));
    }
    public static Integer getFirstDuplicateValue(List<Integer> numbers){
        Set<Integer> visiteNumbers = new HashSet<>();
        for(Integer number: numbers){
            if (!visiteNumbers.add(number)){
                return number;
            }
        }
        return null;
    }

}
