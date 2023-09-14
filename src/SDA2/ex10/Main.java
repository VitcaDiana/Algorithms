package SDA2.ex10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] letters = {'a','s','d','d','s','a'};
        System.out.println(Arrays.toString(getMaxSubPalindroms(letters)));
        System.out.println(getMaxSubPolindrom2(letters));

    }
    public static String getMaxSubPolindrom2(char[] letters){
        int maxLenght = 0;
        int start = 0;
        int end = 0;
        for (int i=0;i< letters.length;i++){
            int left = i;
            int right = i;
            if ((i+1) < letters.length && letters[i] == letters[i+1]){
                right = i+1;
            }

            while (left >= 0 && right < letters.length && letters[left]==letters[right]){
                if (right-left+1 > maxLenght){
                    maxLenght = right-left+1;
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        return new String(Arrays.copyOfRange(letters,start,end+1));

    }

    public static char [] getMaxSubPalindroms(char[] letters){
        int maxLenght = 0;
        int start = 0;
        int end = 0;
        for (int i=0;i< letters.length;i++){
            for (int j=i;j< letters.length;j++){
                //luam secventa de le i la j

                if (isPalindrom(i,j,letters)&& (j-i+1) > maxLenght){
                    maxLenght = j-i+1;
                    start = i;
                    end = j;
                }
            }
        }
//        char[] result = new char[maxLenght];
//        int position = 0;
//        for (int i = start; i <= end; i++){
//            result[position] = letters[i];
//            position++;
//        }
        //return result;
        return Arrays.copyOfRange(letters,start,end+1);

    }
    public static boolean isPalindrom(int i,int j, char[] letters){
        while (i < j){
            if (letters[i] != letters[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
