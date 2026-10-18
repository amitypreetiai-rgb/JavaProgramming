package Module4;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();

        String key = new String("Employee1");
        map.put(key, 101);

        System.out.println("Before: " + map);

        key = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("After: " + map);
    }
}