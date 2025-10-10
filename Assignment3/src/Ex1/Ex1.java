package Ex1;

public class Ex1 {
    public static void main(String[] args) {
        int test = product(3,4);
        System.out.println(test);
    }
    public static int product(int m, int n) {
        if(m == 0)
            return 0;
        return n + product(m - 1, n);
    }
}
