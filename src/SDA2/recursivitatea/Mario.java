package SDA2.recursivitatea;

public class Mario {
    //#
    //##
    //###
    //####
    public static void main(String[] args) {
      //  draw(4);
       // draw2(4);
        draw3(4);
    }

    public static void draw(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");

            }
            System.out.println();

        }

    }
    public static void draw2(int n){
        for (int i = 0; i < n ; i++) {
            System.out.print("#");
        }
        System.out.println();
        draw2(n-1);

    }
    public static void draw3(int n){
        if (n == 0){
            return;
        }
        draw3(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("#");

        }
        System.out.println();
    }
}
