package Ex2;

import maps.SortedTableMap;

public class test {
    public static void main(String[] args) {

        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, null); // test null

        System.out.println("map.containsKey(10) → " + map.containKey(10));
        System.out.println("map.containsKey(20) → " + map.containKey(20));
        System.out.println("map.containsKey(30) → " + map.containKey(30)); // value null
        System.out.println("map.containsKey(40) → " + map.containKey(40));

        System.out.println("map.get(30) → " + map.get(30));  // null but key exists
        System.out.println("map.get(40) → " + map.get(40));  // null but key not exist
    }
}
