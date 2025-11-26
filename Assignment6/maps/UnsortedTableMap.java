package maps;

import java.util.ArrayList;
import java.util.List;

public class UnsortedTableMap<K,V> extends AbstractMap<K,V> {

    // ----- Inner class: TableEntry -----
    private List<Entry<K,V>> table = new ArrayList<>();

    public UnsortedTableMap() { }

    // Utility: find index of key
    private int findIndex(K key) {
        int n = table.size();
        for (int i = 0; i < n; i++) {
            if (table.get(i).getKey().equals(key))
                return i;
        }
        return -1;   // not found
    }

    // ----- get -----
    @Override
    public V get(K key) {
        int i = findIndex(key);
        if (i == -1) return null;
        return table.get(i).getValue();
    }

    // ----- put -----
    @Override
    public V put(K key, V value) {
        int i = findIndex(key);
        if (i == -1) {
            table.add(new MapEntry<>(key, value));
            return null;
        }
        else {
            return table.get(i).setValue(value);
        }
    }

    // ----- remove -----
    @Override
    public V remove(K key) {
        int i = findIndex(key);
        if (i == -1) return null;
        int n = table.size();
        V oldValue = table.get(i).getValue();

        // swap with last element for O(1) deletion
        if (i != n - 1)
            table.set(i, table.get(n - 1));
        table.remove(n - 1);

        return oldValue;
    }

    // ----- size -----
    @Override
    public int size() {
        return table.size();
    }

    // ----- entrySet -----
    @Override
    public Iterable<Entry<K,V>> entrySet() {
        return table;
    }
}
