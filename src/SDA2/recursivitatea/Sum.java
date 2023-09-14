package SDA2.recursivitatea;

public class Sum {
    public static void main(String[] args) {
        //sum[10] = sum(9) + 10
        //sum(n) = sum(n-1) + n
        System.out.println(sum(10));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
