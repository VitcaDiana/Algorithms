package SDA1;

public class Ex3 {
    public static void main(String[] args) {
        //input
        String [] names = {"Alex", "Jacob","Mark","Max"};

        //daca lungimea array-ului este 0, textul este no one...
        //daca lungimea este 1 textul este array[0] +likes this
        //daca lungimea este 2 textul este array[0] and array[1] + like this
        // daca lungimea este 3 textul este array[0],array[1],and array[2] +like this
        // daca lungimea este mai mare decat 3 textul este array[0,array[i]] and (lungimea array-ului -2) other like this

        System.out.println(whoLikesIt(names));

    }
    public static String whoLikesIt(String [] names){
        switch (names.length){
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + "likes this";
            case 2:
                return names[0]+" and "+names[1]+" likes this";
            case 3:
                return names[0] + " , " + names[1] + " and " + names[2] + " likes this";
            default:
                return names[0] + " , " + names[1] + " and " + (names.length-2) + " other lihes this";

        }

    }
}
