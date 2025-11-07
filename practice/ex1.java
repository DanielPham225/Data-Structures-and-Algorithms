public class ex1 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.print(finMax(n, 4))  ;
    }

    public static int finMax(int[] n, int index) {
        if (index == 0) {
            return n[0];
        }
       return n[index] + finMax(n, index + 1 );
    }
}

