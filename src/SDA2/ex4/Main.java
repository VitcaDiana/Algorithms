package SDA2.ex4;

public class Main {
    public static void main(String[] args) {
        String s = "Azi vremea e insorita ";
        System.out.println("Cel mai lung cuvant din sir este  "+findLongestWord(s));
    }

    public static String findLongestWord(String s) {
        String[] s1 = s.split(" ");
        int maxLetters= 0;
        String longestWord = " ";
        for (int i = 0; i < s1.length; i++) {
            if(maxLetters < s1[i].length()){
                maxLetters = s1[i].length();
                longestWord = s1[i];
            }
        }
        return longestWord;
    }


    }

