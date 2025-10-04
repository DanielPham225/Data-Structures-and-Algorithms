import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long limit = 60_000; // 1min
        int n = 200;
        while (true) {
            int[] x = generateRandomArray(n);

            long startTime1 = System.currentTimeMillis();
            unique1(x);
            long endTime1 = System.currentTimeMillis();
            long elapsed1 = endTime1 - startTime1;

            if (elapsed1 > limit) {
                System.out.print("longer than 1 min");
                break;
            }

            if (n > 50_000_000) {
                System.out.println("stop to prevent overflow" + n);
                break;
            }
            n *= 2;
        }

        n = 200;
        while (true) {
            int[] x = generateRandomArray(n);

            long startTime2 = System.currentTimeMillis();
            unique2(x);
            long endTime2 = System.currentTimeMillis();
            long elapsed2 = endTime2 - startTime2;

            if (elapsed2 > limit) {
                System.out.print("longer than 1 min");
                break;
            }
            if (n > 50_000_000) {
                System.out.println("stop to prevent overflow" + n);
                break;
            }
            n *= 2;
        }
    }

    private static int[] generateRandomArray(int n) {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = r.nextInt(-100, 100);
        return arr;
    }

    public static boolean unique1(int[] data) {
        int n = data.length;
        for (int j=0; j < n-1; j++)
            for (int k=j+1; k < n; k++)
                if (data[j] == data[k])
                    return false;                    // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }

    /** Returns true if there are no duplicate elements in the array. */
    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);   // make copy of data
        Arrays.sort(temp);                     // and sort the copy
        for (int j=0; j < n-1; j++)
            if (temp[j] == temp[j+1])            // check neighboring entries
                return false;                      // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }
}