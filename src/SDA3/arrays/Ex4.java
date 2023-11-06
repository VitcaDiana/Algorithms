package SDA3.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {-5, -5, 2, 3, -1};
        if (hasZeroSumSubarray(arr)) {
            System.out.println("true - Exista un subsir cu suma 0");
        } else {
            System.out.println("false - Nu exista niciun subsir cu suma 0");
        }

    }

    public static boolean hasZeroSumSubarray(int[] arr) {
        int currentSum = 0;
        Set<Integer> sum = new HashSet<>();
        for (Integer numar : arr) {
            currentSum += numar;

            // Daca suma curentă este zero sau am mai avut-o , avem un subsir cu suma zero
            if (currentSum == 0 || sum.contains(currentSum)) {
                return true;
            }

            //adaugam suma curenta in setul de sume
            sum.add(currentSum);
        }

        // niciun subsir cu suma zero
        return false;


    }
}
