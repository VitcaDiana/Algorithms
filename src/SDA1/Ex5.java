package SDA1;

public class Ex5 {
    public static void main(String[] args) {
        String s = "programarea este usoara";
        String [] words = s.split(" ");
        String sReverse = " ";
        for (int i = words.length-1;i>=0;i--){
            sReverse += words[i] + " ";

        }
        System.out.println(sReverse);
    }
}
