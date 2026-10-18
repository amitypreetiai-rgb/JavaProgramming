package Module4;

class Pair<K, V> {
    private K key;
    private V value;

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}

public class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>();

        p.setKey(1);
        p.setValue("Preeti");

        System.out.println("Key: " + p.getKey());
        System.out.println("Value: " + p.getValue());
    }
}
