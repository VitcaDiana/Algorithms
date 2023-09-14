package SDA2.recursivitatea;

public class Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34
        //f(N) = f(n-1) + f(n-2)
        System.out.println(getNthFib(7));
    }
    public static int getNthFib(int n){
        if (n == 2){
            return 1;
        } else if (n == 1) {
            return 0;

        }else {
            return getNthFib(n-1) + getNthFib(n-2);
        }
    }
}
