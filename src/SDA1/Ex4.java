package SDA1;

public class Ex4 {
    public static void main(String[] args) {
        //"abcabc"
        System.out.println(isRotation("abc","cab"));
        System.out.println(isRotation("abc","bac"));

    }
    public static boolean isRotation(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String doubleString = s1+ s2;
        return doubleString.contains(s2);

    }
}
