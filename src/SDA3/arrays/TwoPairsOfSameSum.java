package SDA3.arrays;

import java.util.*;

public class TwoPairsOfSameSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,7,1,12,9);
        //parcurg lista
        //pentru fiecare element parcurgem inca o data lista
          //avand o pereche formata facem suma
          //daca mapa nu contine suma
              //bag in mapa suma ca si cheie si perechea ca valoare
          //altfel
              //return perechile de la cheia suma si perechea curenta
        System.out.println(getPairsOfSameSum(numbers));

    }
    public static String getPairsOfSameSum(List<Integer> numbers){
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numbers.size()-1; i++) {
            for (int j = i+1; j < numbers.size() ; j++) {
                Integer currentPairFirst = numbers.get(i);
                Integer currentPairSecond = numbers.get(j);
                int sum = currentPairFirst+currentPairSecond;
                if (!map.containsKey(sum)){
                    List<Integer> newPair = new ArrayList<>();
                    newPair.add(currentPairFirst);
                    newPair.add(currentPairSecond);
                    map.put(sum,newPair);
                }else{
                    List<Integer> existingPair = map.get(sum);
                    return "{" + existingPair.get(0)+ " "+ existingPair.get(1)+ "}{" + currentPairFirst + " " + currentPairSecond+ "}";
                }

            }
        }
        return null;
    }
}
