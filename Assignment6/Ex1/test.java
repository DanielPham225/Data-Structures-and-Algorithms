package Ex1;

import maps.ChainHashMap;

import java.util.Random;

public class test {

    // number of keys to test
    private static final int N = 20000;

    // random key generator
    private static int[] generateRandomKeys(int n) {
        Random r = new Random();
        int[] keys = new int[n];
        for (int i = 0; i < n; i++)
            keys[i] = r.nextInt(Integer.MAX_VALUE);
        return keys;
    }

    public static void main(String[] args) {

        int[] keys = generateRandomKeys(N);

        double[] loadFactors = {0.3, 0.5, 0.7, 0.9};

        System.out.println("---Test---");
        System.out.println("Number of keys: " + N);
        System.out.println();

        for (double f : loadFactors) {
            System.out.println(">>> Testing load factor = " + f);

            ChainHashMap<Integer, Integer> chain =
                    new ChainHashMap<>(17, 109345121, f);

            // INSERT TEST
            long start = System.nanoTime();
            for (int k : keys)
                chain.put(k, k);
            long chainInsert = System.nanoTime() - start;

            // SEARCH TEST
            start = System.nanoTime();
            for (int k : keys)
                chain.get(k);
            long chainSearch = System.nanoTime() - start;

            // REMOVE TEST
            start = System.nanoTime();
            for (int k : keys)
                chain.remove(k);
            long chainRemove = System.nanoTime() - start;

            System.out.println("      insert: " + chainInsert / 1_000_000.0 + " ms");
            System.out.println("      search: " + chainSearch / 1_000_000.0 + " ms");
            System.out.println("      remove: " + chainRemove / 1_000_000.0 + " ms");

        }
    }
}
