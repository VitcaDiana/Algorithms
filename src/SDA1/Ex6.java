package SDA1;

public class Ex6 {
    public static void main(String[] args) {
        // String-ul "AAAAAAAAAAAAABBCCCCDD"
        //run length encoding

        //parcurg toate caracterele incepand de la indexul 1
        // verific daca caracterul de la pozitia curenta este diferit cu caracterul de la pozitia anterioara SAU contorul = 9
        //pun contorul si caractrul d ela pozitia anterioara in string-ul codificat
        //resetez contorul la 0
        //contorizez

        System.out.println(rle("AAAAAAAAAAAAABBCCCCDD"));

    }
    public static String rle(String s){
        int currentLength = 1;
        String encodedString = " ";
        for (int i = 1; i< s.length();i++){
            char previosCharacter = s.charAt(i-1);
            char currentCharacter = s.charAt(i);
            if (previosCharacter != currentCharacter || currentLength == 9) {

                encodedString += currentLength;
                encodedString += previosCharacter;
                currentLength = 0;
            }
            currentLength++;
        }
        return encodedString;
    }
}
