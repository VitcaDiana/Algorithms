package SDA1;

public class Ex7 {
    public static void main(String[] args) {

        String s = "baca";
        String[] substrings = new String[100];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubstring = s.substring(i, j);
//                if (!contains(substrings, s.substring(i, j))) {
                    substrings[k] = currentSubstring;
                    k++;
//
//                }

            }

        }
    }
}
