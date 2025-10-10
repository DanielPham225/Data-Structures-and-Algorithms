import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 4000, 8000, 16000, 32000};

        for (int n : sizes) {
            double[] x = generateRandomArray(n);

            long startTime1 = System.nanoTime();
            prefixAverage1(x);
            long endTime1 = System.nanoTime();
            long elapsed1 = endTime1 - startTime1;

            long startTime2 = System.nanoTime();
            prefixAverage2(x);
            long endTime2 = System.nanoTime();
            long elapsed2 = endTime2 - startTime2;

            System.out.println("prefixAverage1 time = " + elapsed1 + " nano");
            System.out.println("prefixAverage2 time = " + elapsed2 + " nano");
        }
    }

    // Helper: random array generator
    private static double[] generateRandomArray(int n) {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++)
            arr[i] = r.nextDouble(-100.0, 100.0);
        return arr;
    }

    public static double[] prefixAverage1(double[] x) {
        int n = x.length;
        double[] a = new double[n];
        for (int j = 0; j < n; j++) {
            double total = 0;
            for (int i = 0; i <= j; i++)
                total += x[i];
            a[j] = total / (j + 1);
        }
        return a;
    }

    public static double[] prefixAverage2(double[] x) {
        int n = x.length;
        double[] a = new double[n];
        double total = 0;
        for (int j = 0; j < n; j++) {
            total += x[j];
            a[j] = total / (j + 1);
        }
        return a;
    }
}