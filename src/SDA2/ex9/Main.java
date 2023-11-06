package SDA2.ex9;

public class Main {
    //Înmulțești fiecare a doua cifră cu 2, începând cu penultima cifră a numărului, și adaugi cifrele acelor produse.
    //Adaugi suma la suma cifrelor care nu au fost înmulțite cu 2.
    //Dacă ultima cifră a totalului este 0 (sau, mai formal, dacă totalul modulo 10 este congruent cu 0), numărul este valid!
    public static void main(String[] args) throws Exception {
        String cardNumber = "4003600000000014";
        if (!isCardValid(cardNumber)){
            throw new Exception("Cardul nu este valid");
        }else{
            System.out.println("Cardul este valid");
        }
    }
    public static boolean isCardValid(String cardNumber){
        int sum = 0;
        boolean doubleDigit = false;
        for (int i = cardNumber.length() -1; i >=0 ; i--) {
           // char[] caracter = cardNumber.toCharArray();
            int digit = Character.getNumericValue(cardNumber.charAt(i));


            if (doubleDigit){
                digit *=2;
                if (digit > 9){
                    digit = digit % 10 + 1;

                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return (sum % 10 == 0);
    }
}
