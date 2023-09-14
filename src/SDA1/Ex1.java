package SDA1;

public class Ex1 {
    public static void main(String[] args) {
        //input- numarul de scanduri
        int n = 13;

        //output
        int red = 1;
        int blue = 1;
        int purple = 0;
        int noColor = 1;


        for(int i = 4; i<=n;i++){
            if(i % 2 == 0 && i % 3 == 0){
                purple ++;
            }
            else if (i % 2 == 0){
                red++;
            } else if (i % 3 == 0) {
                blue++;

            }
            else {
                noColor++;
            }

        }
        System.out.println("red "+red);
        System.out.println("blue "+blue);
        System.out.println("purple "+purple);
        System.out.println("noColor "+noColor);
    }
}
