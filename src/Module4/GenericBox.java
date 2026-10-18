package Module4;

class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.addItem("Java");
        System.out.println(b1.getItem());

        Box<Integer> b2 = new Box<>();
        b2.addItem(100);
        System.out.println(b2.getItem());
    }
}
