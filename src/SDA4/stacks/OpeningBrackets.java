package SDA4.stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpeningBrackets {
    // (([]()()){})
    //()(  sau ((])

    //parcurg string-ul
    //daca caracterul curent nu e paranteza inchisa
    //bag pe stiva caracterul curent
    //altfel paranteza e inchisa si nu corespounde cu ultima paranteza de pe stiva
    //false
    //daca coresponde scot ultimul element din stiva
    //returnez valoarea de adevar a expresiei: stiva este goala

    public static boolean areBalancedBrackets(String str) {
        List<Character> stack = new ArrayList<>();
        String openingBrackets = "([{";
        String closingBrackets = ")]}";
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put(']', '[');
        matchingBrackets.put('}', '{');
        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);
            if (openingBrackets.indexOf(bracket) != -1) {
                stack.add(bracket);
            } else if (closingBrackets.indexOf(bracket) != -1) {
                if (stack.get(stack.size() - 1) != matchingBrackets.get(bracket)) {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }

            }
        }
        return stack.size() == 0;

    }

    public static void main(String[] args) {
        String s = "(([]()()){})";
        System.out.println(areBalancedBrackets(s));

    }
}
