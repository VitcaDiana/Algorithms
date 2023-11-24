package exemple;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    //characters: "!tnus ubn eramargorp al"
    //document: "Sunt bun la programare"
    public static void main(String[] args) {
        String characters = "!tnus ubn eramargorp al";
        String document = "Sunt bun la programare";
        System.out.println(canBeGenerated(characters, document));


    }
    
    public static boolean canBeGenerated(String characters, String document) {
        //generez mapa in care cheia este fiecare caracter din characters si valoarea este de cate ori apare
        //pentru fiecare caracter din document
        //verific daca mapa nu  contine ca si cheie caracterul curent sau daca valoarea de la caracterul curent din mapa este 0
        //return false;
        //scad de la cheia caracterului curent din valoare 1
        Map<Character, Integer> charactersMap = new HashMap<>();

        for (Character c : characters.toCharArray()) {
            if (charactersMap.containsKey(c)) {
                charactersMap.put(c, charactersMap.get(c) + 1);
            } else {
                charactersMap.put(c, 1);
            }
        }
        for (Character c : document.toCharArray()) {
            if (!charactersMap.containsKey(c) || charactersMap.get(c) == 0) {
                return false;
            }
            charactersMap.put(c, charactersMap.get(c) - 1);

        }
        return true;

    }
}
