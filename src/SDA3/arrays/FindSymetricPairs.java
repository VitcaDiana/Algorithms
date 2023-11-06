package SDA3.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSymetricPairs {
    public static void main(String[] args) {
    List<List<Integer>> pairs = List.of(List.of(1,2),List.of(3,4),List.of(5,9),List.of(4,3),List.of(4,3),List.of(9,5));

    //initializez o mapa in care cheia va reprezenta primul element dintr-o pereche si valoarea al doilea element
    //parcurg lista de perechi
       //daca mapa contine ca si cheie al doilea nr din lista si valoarea de la acea cheie este primul nr din lista
          //return perechea
       //daca nu bag perechea in mapa
        System.out.println(findSymetricPairs(pairs));
    }
    public static List<List<Integer>> findSymetricPairs(List<List<Integer>> pairs){
        Map<Integer,Integer> map = new HashMap<>();
        for (List<Integer> pair : pairs){
            Integer firestNumber = pair.get(0);
            Integer secondNumber = pair.get(1);
            if (map.containsKey(secondNumber) && map.get(secondNumber)== firestNumber){
                return List.of(List.of(firestNumber,secondNumber),List.of(secondNumber,firestNumber));
            }
            map.put(firestNumber,secondNumber);
        }
        return null;
    }

}
